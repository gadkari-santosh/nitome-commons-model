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

import com.nitome.dto.enums.ContentType;
import com.nitome.dto.enums.GradeCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Lecture {

    private String id;
    private String title;

    private GradeCode grade;

    private ContentType contentType; // file or html
    private String data; // if file then its file url or text.

}