/*
 * Copyright (c) 2023,2024,2025 Neetome, All rights reserved
 *
 * Licensed under the Neetome, Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * Reach out to Neetome organization to obtain copy of the license.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed, copying & reusing file in STRICTLY PROHIBITED.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nitome.dto.questions;

import com.nitome.dto.enums.GradeCode;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionSet {

    private String id;

    private String questionSetId;

    private Long relativeId;

    private String name;

    private String description;

    private GradeCode grade;

    private Float negativeMark = 0.0f;

    private Float marksPerQuestion = 1.0f;

    private Float totalMarks;

    private Float totalTime; // -1 for unlimited time.

    private List<Question> questions;
}
