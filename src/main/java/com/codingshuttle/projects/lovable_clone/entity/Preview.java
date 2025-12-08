package com.codingshuttle.projects.lovable_clone.entity;

import java.time.Instant;

import com.codingshuttle.projects.lovable_clone.enums.PreviewStatus;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Preview {

    Long id;

    Project project;

    String namespace;
    String podName;
    String previewUrl;
    PreviewStatus previewStatus;
    Instant startedAt;
    Instant terminatedAt;
    Instant createdAt;

}
