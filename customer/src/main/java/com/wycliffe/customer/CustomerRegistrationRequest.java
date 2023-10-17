package com.wycliffe.customer;

public record CustomerRegistrationRequest(
        String firstname,
        String lastname,
        String email
) {
}
