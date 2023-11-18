package com.nitome.dto.practice;

import com.nitome.dto.enums.SubjectCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PracticeSubject {

    private SubjectCode name;

    private List<Chapter> chapters;
}
