package com.codingshuttle.projects.lovable_clone.entity;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Preview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    // Project project;

    String namespace;
    String podName;
    String previewUrl;
    // PreviewStatus previewStatus;
    Instant startedAt;
    Instant terminatedAt;
    Instant createdAt;

}
