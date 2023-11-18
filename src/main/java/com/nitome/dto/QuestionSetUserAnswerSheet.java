package com.nitome.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class QuestionSetUserAnswerSheet {

    private String questionSetId;

    private Long id; // this could be board id, practice id or question set id

    private String userId;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private Long totalTimeInMs;

    private List<UserAnswer> answers;
}