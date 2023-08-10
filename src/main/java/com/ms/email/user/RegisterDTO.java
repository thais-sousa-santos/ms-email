package com.ms.email.user;

public record RegisterDTO(
        String login,
        String password,
        UserRole role) {
}
