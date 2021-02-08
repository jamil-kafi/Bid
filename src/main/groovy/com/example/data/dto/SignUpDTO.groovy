package com.example.data.dto

import groovy.transform.Canonical
import io.micronaut.core.annotation.Introspected

import javax.validation.constraints.*

@Canonical
@Introspected
class SignUpDTO {

    @NotBlank
    @Email
    String email

    @NotBlank
    @Pattern(regexp = /[0-9]{8}/)
    String phone

    @NotNull
    @Size(min = 4)
    String name

    String address

    @NotBlank
    @Size(min = 4)
    String login

    @NotBlank
    @Size(min = 6)
    String password

}
