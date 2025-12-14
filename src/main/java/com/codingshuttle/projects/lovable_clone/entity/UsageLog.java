package com.codingshuttle.projects.lovable_clone.entity;

import java.time.Instant;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class UsageLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    // User user;
    // Project project;
    String action;
    Integer tokenUsed;
    Integer durationMs;
    String metaData;// JSON of {model_used, prompt_used}
    Instant createdAt;
}
