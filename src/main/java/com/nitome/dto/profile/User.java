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

package com.nitome.dto.profile;

import com.nitome.dto.enums.Subscription;
import com.nitome.dto.enums.UserStatus;
import com.nitome.dto.enums.UserType;
import lombok.Data;

@Data
public class User {

    private Long id;

    private String userName;

    private UserType type;

    private UserStatus status;

    private Subscription subscriptionType;
}
