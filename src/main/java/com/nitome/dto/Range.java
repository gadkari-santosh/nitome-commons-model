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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.util.Objects;
import lombok.*;

@Value
@Builder(setterPrefix = "with")
@JsonPOJOBuilder(withPrefix = "")
@JsonDeserialize(builder = Range.RangeBuilder.class)
public class Range<T> {

    T from;

    T to;

    @JsonProperty("displayString")
    public String displayString() {

        if (Objects.nonNull(to) && Objects.isNull(from)) {
            return String.format("upto %s", to.toString());
        } else if (Objects.isNull(to) && Objects.nonNull(from)) {
            return String.format("> %s", from.toString());
        } else if (Objects.nonNull(to)) {
            return String.format("%s - %s", from.toString(), to.toString());
        } else {
            throw new IllegalArgumentException("Undefined Range. Either to or from is mandatory.");
        }
    }

    public String toString() {
        return displayString();
    }
}
