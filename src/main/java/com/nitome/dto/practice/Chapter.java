package com.nitome.dto.practice;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Chapter {

    private String name;

    private float weightage;

    private List<QuestionSetInfo> questionSets;

    private List<Topic> topics;
}
