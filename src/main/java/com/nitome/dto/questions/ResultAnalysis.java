package com.nitome.dto.questions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResultAnalysis {

    // questions per hour
    private Integer speed;

    private Double avgSolvingTime;

    private float maxSolvingTime;

    private float minSolvingTime;

    private Double percentage;

    private Integer correctAnswers;

    private Integer wrongAnswer;

    private Integer skipped;

    private Integer guessed;
}
