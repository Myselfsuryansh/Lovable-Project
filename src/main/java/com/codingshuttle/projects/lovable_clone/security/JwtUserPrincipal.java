package com.codingshuttle.projects.lovable_clone.security;

import java.util.List;

import org.springframework.security.core.GrantedAuthority;

public record JwtUserPrincipal(Long userId, String username, List<GrantedAuthority> authorities) {

}
