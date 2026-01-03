package com.codingshuttle.projects.lovable_clone.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.codingshuttle.projects.lovable_clone.dto.auth.SignUpRequest;
import com.codingshuttle.projects.lovable_clone.dto.auth.UserProfileResponse;
import com.codingshuttle.projects.lovable_clone.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "passwordHash", source = "password")
    @Mapping(target = "avatarUrl", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "deletedAt", ignore = true)
    User toEntity(SignUpRequest signUpRequest);

    UserProfileResponse toUserProfileResponse(User user);
}
