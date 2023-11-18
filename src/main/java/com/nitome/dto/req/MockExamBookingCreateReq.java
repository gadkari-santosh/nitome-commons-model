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

package com.nitome.dto.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.nitome.dto.enums.GradeCode;
import com.nitome.dto.enums.MockExamMode;
import com.nitome.dto.enums.SubjectName;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
public class MockExamBookingCreateReq {

    private String imageName;

    private Long authorId;

    private Long examId;

    private List<MockBookingSlotCreateReq> bookingSlots;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    private LocalDate examDate;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="HH:mm:ss")
    private LocalTime examTime;

    private MockExamMode mode;

    private String fullAddress;

    private String city;

    private String shortAddr;

    private String contact;

    private GradeCode grade;

    private SubjectName subjectNAME;

    private String createdBy;
}
