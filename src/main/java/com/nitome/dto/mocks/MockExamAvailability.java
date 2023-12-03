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

import lombok.Data;

import java.time.LocalDate;

@Data
public class MockExamAvailability implements Comparable<MockExamAvailability> {

    LocalDate date;

    Long totalSlots = 0l;

    public MockExamAvailability(LocalDate date){
        this.date = date;
    }

    public void addToTotalSlots(long slots) {
        totalSlots = totalSlots + slots;
    }

    @Override
    public int compareTo(MockExamAvailability mockExamAvailability) {
        return this.date.compareTo(mockExamAvailability.getDate());
    }
}
