package com.nitome.dto.mocks;

import com.nitome.dto.Student;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Data
public class MockExamBookingForm {

    private Long examId;

    private Long slotId;

    private Long accountId;

    private List<Student> students;
}