package com.nitome.dto.practice;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PracticeExam {

    private String id;
    private String description;
    private Integer questionSetSize;
    private Integer marks;
    private Integer durationInMin;

    private List<QuestionSetInfo> questionSets;
}