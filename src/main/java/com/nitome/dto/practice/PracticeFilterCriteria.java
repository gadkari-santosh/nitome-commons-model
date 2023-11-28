package com.nitome.dto.practice;

import com.nitome.dto.enums.GradeCode;
import com.nitome.dto.enums.Offering;
import com.nitome.dto.enums.SubjectCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class PracticeFilterCriteria implements Serializable {

    private List<SubjectCode> subjects;

    private List<Long> examIds;

    private GradeCode grade;

    private List<Long> authorIds;

    private List<Offering> offering;

    private Integer pageNo = 0;

    private Integer pageSize = Integer.MAX_VALUE;

}