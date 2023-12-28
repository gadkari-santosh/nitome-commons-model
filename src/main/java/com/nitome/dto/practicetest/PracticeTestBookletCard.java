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
import com.nitome.dto.enums.Offering;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PracticeTestBookletCard {

    private Long id;

    private String authorName;

    private String image;

    private String name;

    private String subjects;

    private GradeCode grade;

    private Double avgRating;

    private Long totalReviews;

    private Offering offering;
}
