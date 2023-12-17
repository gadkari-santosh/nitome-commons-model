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

import com.nitome.dto.enums.GradeCode;
import com.nitome.dto.enums.MockExamMode;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class MockExamCard {

    private Long id;

    private String instName;

    private String examName;

    private LocalDate examDate;

    private LocalTime examTime;

    private MockExamMode examMode;

    private String shortAddr;

    private GradeCode grade;

    private String imageName;

    private Long durationInMinutes;

    private List<MockExamBookingSlot> bookingSlots;
}
