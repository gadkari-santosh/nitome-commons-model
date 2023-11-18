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

import com.nitome.dto.enums.ExamRegistrationMode;
import com.nitome.dto.enums.Medium;
import com.nitome.dto.enums.SubjectName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExamCreateReq {

    private String name;

    private String desc;

    private String authority;

    private Medium medium;

    private String imageName;

    private SubjectName subjectNAME;

    // Comma separated string of grades.
    private String grades;

    private String registrationUrl;

    private String examUrl;

    private ExamRegistrationMode registrationMode;

    private String registrationInfo;

    private String createdBy;
}