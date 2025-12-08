package com.codingshuttle.projects.lovable_clone.dto.member;

import java.time.Instant;

import com.codingshuttle.projects.lovable_clone.enums.ProjectRole;

public record MemberResponse(
        Long userId,
        String email,
        String name,
        String avatarUrl,
        ProjectRole role,
        Instant invitedAt) {

}
