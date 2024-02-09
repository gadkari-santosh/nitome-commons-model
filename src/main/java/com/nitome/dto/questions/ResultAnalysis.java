package com.nitome.dto.questions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResultAnalysis {

    private Integer totalQuestions;

    private Integer attemptedQuestions;

    private Integer correctQuestions;

    private Integer wrongQuestions;

    private Integer unattemptedQuestions;

    private Integer guessedQuestions;

    private Double avgAccuracy;

    private Double avgTime;

    // questions per hour
    private Integer speed;

    private Integer score;

    private Integer totalMarks;

    private String grade;

    private Double maxSolvingTime;

    private Double minSolvingTime;

    private Double percentage;
}
