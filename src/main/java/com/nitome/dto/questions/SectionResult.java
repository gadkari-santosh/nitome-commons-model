package com.nitome.dto.questions;

import lombok.Data;

@Data
public class SectionResult {

    private String name;

    private Integer totalQuestions;

    private Integer attemptedQuestions;

    private Integer correctQuestions;

    private Integer wrongQuestions;
}
