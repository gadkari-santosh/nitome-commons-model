package com.nitome.dto.practicetest;


import com.nitome.dto.questions.QuestionSetInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
public class Topic {

    private String name;

    private List<QuestionSetInfo> questionSets;

    public Topic(String name) {
        this.name = name;
    }

    public Topic() {}
}
