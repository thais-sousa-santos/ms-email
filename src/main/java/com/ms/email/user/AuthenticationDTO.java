package com.ms.email.user;

public record AuthenticationDTO(
        String login,
        String password
) {
}
