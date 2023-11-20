package com.graysan.security.jwttoken.dto;

public record AuthRequest(
    String username,
    String password
) {
}
