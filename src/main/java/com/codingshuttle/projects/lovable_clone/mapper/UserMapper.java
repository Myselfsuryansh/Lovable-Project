package com.codingshuttle.projects.lovable_clone.mapper;

import org.mapstruct.Mapper;

import com.codingshuttle.projects.lovable_clone.dto.auth.SignUpRequest;
import com.codingshuttle.projects.lovable_clone.dto.auth.UserProfileResponse;
import com.codingshuttle.projects.lovable_clone.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(SignUpRequest signUpRequest);

    UserProfileResponse toUserProfileResponse(User user);
}
