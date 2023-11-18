package com.nitome.dto.req;

import com.nitome.dto.enums.GradeCode;
import com.nitome.dto.enums.Offering;
import com.nitome.dto.enums.SubjectName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PastPaperCreateReq {

    private String description;

    private String image;

    private SubjectName subjectNAME;

    private GradeCode grade;

    private Double avgRating;

    private Offering offering;

    private Boolean frontRunner;

    private Long examId;

    private Long authorId;

}
