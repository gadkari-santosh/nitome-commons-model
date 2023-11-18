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

import com.nitome.dto.enums.ExamRegistrationMode;
import com.nitome.dto.enums.GradeCode;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@Data
public class ExamRegistrationInfo {

    // Image name which can be downloaded with another service.
    private String imageName;

    // complete name of exam.
    private String examName;

    // exam short description
    private String description;

    // exam registration start date.. should be in future.
    private LocalDate registrationStart;

    // exam registration end date.. should be in future.
    private LocalDate registrationEnd;

    private LocalTime examTime;

    private LocalDate examDate;

    // available grade for this exam.
    private GradeCode grade;

    // online or offline registration mode.
    private ExamRegistrationMode mode;

    // url for exam registration.
    private String url;

    // extra information about registration
    // e.g. registration happens from school
    private String registrationInfo;
}