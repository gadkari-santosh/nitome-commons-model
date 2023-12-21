package com.nitome.dto.mocks;

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

    private LocalTime startTime;

    private LocalTime reportingTime;

    private LocalTime endTime;
}
