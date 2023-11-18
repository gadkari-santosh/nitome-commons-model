package com.nitome.dto.practice;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class PracticeIndex {

    private List<PracticeSubject> subjects = new ArrayList<>();

    private List<PracticeExam> exams = new ArrayList<>();
}
