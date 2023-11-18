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

package com.nitome.dto.practice;

import com.nitome.dto.enums.GradeCode;
import com.nitome.dto.enums.SubjectCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Practice {

    private String id;

    private Long practiceId;

    private String name;

    private String description;

    private String image;

    private GradeCode grade;

    private Long examId;

    private Long authorId;

    private List<SubjectCode> subjects = new ArrayList<>();

    // 20+ exam set
    // 1000 practice questions etc
    private List<String> features = new ArrayList<>();

    private PracticeIndex index;
}