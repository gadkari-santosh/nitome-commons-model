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

package com.nitome.dto.reviews;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserReviews {

    private Long id;
    private Long refId;

    private Integer rating;

    private Long userId;
    private String userName;

    private String headline;
    private String review;

    private ReviewTag tag;

    private LocalDateTime updatedOn;
    private LocalDateTime createdOn;
}
