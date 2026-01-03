package com.codingshuttle.projects.lovable_clone.security;

import java.nio.charset.StandardCharsets;
import java.sql.Date;
import java.util.ArrayList;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.codingshuttle.projects.lovable_clone.entity.User;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class AuthUtil {
    @Value("${jwt.secret-key}")
    private String jwtSecretKey;

    private SecretKey getSecretKey() {
        return Keys.hmacShaKeyFor(jwtSecretKey.getBytes(StandardCharsets.UTF_8));
    }

    public String generateAccessToken(User user) {
        return Jwts.builder().subject(user.getName())
                .claim("userId", user.getId().toString())
                .issuedAt(new Date(0))
                .expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 10))
                .signWith(getSecretKey())
                .compact();
    }

    public JwtUserPrincipal verifyAccessToken(String token) {
        Claims claims = Jwts.parser().verifyWith(getSecretKey()).build().parseSignedClaims(token).getPayload();
        Long userId = Long.parseLong(claims.get("userId", String.class));
        String username = claims.getSubject();

        return new JwtUserPrincipal(userId, username, new ArrayList<>());
    }


    public Long getCurrentUserId(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if(authentication == null || !(authentication.getPrincipal() instanceof JwtUserPrincipal user))
            {
                throw new AuthenticationCredentialsNotFoundException("No JWT Found");
            }
        log.info("UserId->",user.userId());
        return user.userId();
    }
}
