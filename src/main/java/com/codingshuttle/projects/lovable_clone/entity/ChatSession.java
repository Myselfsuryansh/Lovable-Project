package com.codingshuttle.projects.lovable_clone.entity;

import java.time.Instant;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatSession {

    Project project;
    User user;
    String title;
    Instant createdAt;

    Instant updatedAt;

    Instant deletedAt;
}
