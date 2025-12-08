package com.codingshuttle.projects.lovable_clone.entity;

import java.time.Instant;

import com.codingshuttle.projects.lovable_clone.enums.MessageRole;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatMessage {

    Long id;
    ChatSession chatSession;
    String content;
    MessageRole role;
    String toolCalls;// JSON Array
    Integer tokenUsed;

    Instant createdAt;
}
