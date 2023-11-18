package com.nitome.dto.mocks;

import com.nitome.dto.ExamCentre;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
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

    private ExamCentre examCentre;

    private Double price;

}
