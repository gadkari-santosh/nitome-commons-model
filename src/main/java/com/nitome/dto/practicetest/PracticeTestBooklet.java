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

package com.nitome.dto.practicetest;

import com.nitome.dto.enums.GradeCode;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class PracticeTestBooklet {

    private String id;

    private Long practiceId;

    private String name;

    private String description;

    private String image;

    private GradeCode grade;

    private Long examId;

    private Long authorId;

    private String authorName;

    // 20+ exam set
    // 1000 practice questions etc
    private List<String> features = new ArrayList<>();

    private List<PracticeTestSubject> subjects = new ArrayList<>();

    private List<PracticeTest> exams = new ArrayList<>();
}
