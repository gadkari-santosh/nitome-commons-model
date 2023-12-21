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

package com.nitome.dto.mocks;

import com.nitome.dto.Range;
import com.nitome.dto.enums.GradeCode;
import com.nitome.dto.enums.MockExamMode;
import java.time.LocalDate;
import lombok.Data;

@Data
public class MockExamFilterCriteria {

    private MockExamMode examMode;

    private Long examId;

    private GradeCode grade;

    private Long authorId;

    private LocalDate examDateFrom;

    private LocalDate examDateTo;

    private Range<Double> priceRange;

    private String city;

    private Integer pageNo = 0;

    private Integer pageSize = Integer.MAX_VALUE;
}
