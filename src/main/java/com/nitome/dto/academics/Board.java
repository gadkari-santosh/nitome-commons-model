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

package com.nitome.dto.academics;

import com.nitome.dto.Grade;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Board {

    private Long id;
    private String name;
    private String desc;
    private String authority;
    private String imageName;
    private List<Grade> grades;
    private Boolean isActive;

    private Grade defaultGrade;
}
