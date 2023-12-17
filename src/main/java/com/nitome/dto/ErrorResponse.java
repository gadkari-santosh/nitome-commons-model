package com.nitome.dto;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ErrorResponse {

    LocalDateTime timestamp;
    String message;
    String id;
}
