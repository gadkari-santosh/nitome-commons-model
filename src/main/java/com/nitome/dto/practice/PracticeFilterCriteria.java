package com.nitome.dto.practice;

import com.nitome.dto.enums.GradeCode;
import com.nitome.dto.enums.Offering;
import com.nitome.dto.enums.SubjectName;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PracticeFilterCriteria {

    private List<SubjectName> subjects;

    private List<Long> examIds;

    private GradeCode grade;

    private List<Long> authorIds;

    private List<Offering> offering;

    private Integer pageNo = 0;

    private Integer pageSize = Integer.MAX_VALUE;

}