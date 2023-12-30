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

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class ReviewSummery {

    private Long id;
    private Long refId;

    private ReviewTag tag;
    private Float avgRating;

    private Long totalReviews;
    private Long totalR1;
    private Long totalR2;
    private Long totalR3;
    private Long totalR4;
    private Long totalR5;

    private LocalDateTime updatedOn;
}
