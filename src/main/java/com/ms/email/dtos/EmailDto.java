package com.ms.email.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record EmailDto(
        @NotNull
        @NotBlank
        String ownerRef,

        @NotNull
        @NotBlank
        @Email
        String emailFrom,

        @NotNull
        @NotBlank
        @Email
        String emailTo,

        @NotBlank
        String subject,

        @NotBlank
        String text) {

}
