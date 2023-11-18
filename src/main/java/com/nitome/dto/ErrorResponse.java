package com.nitome.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
public class ErrorResponse {

    LocalDateTime timestamp;
    String message;
    String id;
}
