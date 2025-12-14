package com.codingshuttle.projects.lovable_clone.service;

import org.springframework.stereotype.Service;

import com.codingshuttle.projects.lovable_clone.dto.auth.UserProfileResponse;
import com.codingshuttle.projects.lovable_clone.interfaceService.IUserService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
@RequiredArgsConstructor
public class UserService implements IUserService {

    @Override
    public UserProfileResponse getProfile(Long userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProfile'");
    }

}
