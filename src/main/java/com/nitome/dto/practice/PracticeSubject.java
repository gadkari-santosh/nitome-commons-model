package com.nitome.dto.practice;

import com.nitome.dto.enums.SubjectName;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PracticeSubject {

    private SubjectName name;

    private List<Chapter> chapters;
}
