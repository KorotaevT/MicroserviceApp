package ru.cs.korotaev;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
