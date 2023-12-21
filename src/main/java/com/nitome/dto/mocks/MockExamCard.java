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

import com.nitome.dto.Price;
import com.nitome.dto.enums.GradeCode;
import com.nitome.dto.enums.MockExamMode;
import java.time.LocalDate;
import java.util.List;
import lombok.Data;

@Data
public class MockExamCard {

    private Long id;

    private String instName;

    private String examName;

    private MockExamMode examMode;

    private String shortAddr;

    private String fullAddr;

    private String city;

    private String contactPhone;

    private String contactName;

    private GradeCode grade;

    private String imageName;

    private Long examDuration;

    private LocalDate examDate;

    private Price price;

    private List<MockExamBookingSlot> bookingSlots;
}
