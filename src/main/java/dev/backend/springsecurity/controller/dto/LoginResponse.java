package dev.backend.springsecurity.controller.dto;

public record LoginResponse(String accessToken, Long expiresIn) {
}
