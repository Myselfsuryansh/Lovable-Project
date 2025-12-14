package com.codingshuttle.projects.lovable_clone.interfaceService;

import com.codingshuttle.projects.lovable_clone.dto.auth.UserProfileResponse;

public interface IUserService {

    UserProfileResponse getProfile(Long userId);

}
