/* Copyright (C) 2023 Neetome LLC - All Rights Reserved
 * You can not use, distribute and modify this code without prior permission.
 *
 * You should have received a copy of the XYZ license with
 * this file. If not, please write to: , or visit :
 */
package com.nitome.dto.questions;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * @Santosh Gadkari
 */
@Getter
@Setter
public class QuestionSetResult {

    private String questionSetId;

    private String userId;

    private ResultAnalysis resultAnalysis;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime resultTime;

    private List<QuestionAnalysis> questionAnalyses;

    private List<SectionResult> sectionResult;
}
