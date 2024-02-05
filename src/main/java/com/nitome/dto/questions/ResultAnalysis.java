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

    private Float avgAccuracy;

    private Float avgTime;

    // questions per hour
    private Integer speed;

    private Integer score;

    private Integer grade;

    private Double avgSolvingTime;

    private float maxSolvingTime;

    private float minSolvingTime;

    private Double percentage;
}
