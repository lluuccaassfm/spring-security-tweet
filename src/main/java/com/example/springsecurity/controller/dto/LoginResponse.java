package com.example.springsecurity.controller.dto;

public record LoginResponse(String acessToken, Long expiresIn) {
}
