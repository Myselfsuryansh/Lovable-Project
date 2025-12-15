package com.codingshuttle.projects.lovable_clone.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.codingshuttle.projects.lovable_clone.dto.member.MemberResponse;
import com.codingshuttle.projects.lovable_clone.entity.ProjectMember;
import com.codingshuttle.projects.lovable_clone.entity.User;

@Mapper(componentModel = "spring")
public interface ProjectMemberMapper {
    
    @Mapping(target = "userId", ignore = true)
    @Mapping(target = "role", constant = "OWNER")
    @Mapping(target = "invitedAt", ignore = true)
    MemberResponse toProjectMemberResponseFromOwner(User owner);

    @Mapping(target = "userId", source = "user.id")
    @Mapping(target = "role", source = "projectRole")
    @Mapping(target = "email", source = "user.email")
    @Mapping(target = "name", source = "user.name")
    @Mapping(target = "avatarUrl", source = "user.avatarUrl")
    MemberResponse toProjectMemberResponseFromMember(ProjectMember projectMember);
}
