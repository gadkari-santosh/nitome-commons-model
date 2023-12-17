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

package com.nitome.dto;

import com.nitome.dto.enums.GradeCode;
import com.nitome.dto.enums.MockExamMode;
import com.nitome.dto.enums.SubjectCode;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import lombok.Data;

@Data
public class MockExamBookingAvailabilityFilterCriteria implements Serializable {

    private List<String> examNames;

    private List<SubjectCode> subjectNames;

    private List<Long> examIds;

    private GradeCode grade;

    private List<String> authors;

    private List<Long> authorIds;

    private List<MockExamMode> registrationModes;

    private LocalDate fromDate;

    private LocalDate toDate;

    private String city;

    private Integer pageNo = 0;

    private Integer pageSize = Integer.MAX_VALUE;
}
