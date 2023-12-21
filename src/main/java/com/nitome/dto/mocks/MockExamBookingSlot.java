package com.nitome.dto.mocks;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.nitome.dto.DateFormat;
import java.time.LocalTime;
import lombok.Data;

@Data
public class MockExamBookingSlot {

    private Long id;

    private Integer totalCapacity;

    private Integer totalBooked;

    private Boolean isOpen;

    private Boolean isCancelled;

    private String cancellationReason;

    @JsonFormat(pattern = DateFormat.DEFAULT_TIME_NO_SEC_FORMAT)
    private LocalTime startTime;

    @JsonFormat(pattern = DateFormat.DEFAULT_TIME_NO_SEC_FORMAT)
    private LocalTime reportingTime;

    @JsonFormat(pattern = DateFormat.DEFAULT_TIME_NO_SEC_FORMAT)
    private LocalTime endTime;
}
