package dev.backend.springsecurity.controller.dto;

public record FeedItemDto(long tweetId, String content, String username) {
}
