package com.nitome.dto.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
public class MockBookingSlotCreateReq {

    private Integer totalCapacity;

    private Integer totalBooked;

    private Boolean isOpen;

    private Boolean isCancelled;

    private String cancellationReason;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="HH:mm:ss")
    private LocalTime startTime;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="HH:mm:ss")
    private LocalTime reportingTime;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="HH:mm:ss")
    private LocalTime endTime;

    private String createdBy;
}
