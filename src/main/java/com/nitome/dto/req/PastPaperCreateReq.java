package com.nitome.dto.req;

import com.nitome.dto.enums.GradeCode;
import com.nitome.dto.enums.Offering;
import com.nitome.dto.enums.SubjectCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PastPaperCreateReq {

    private String description;

    private String image;

    private SubjectCode subjectNAME;

    private GradeCode grade;

    private Double avgRating;

    private Offering offering;

    private Boolean frontRunner;

    private Long examId;

    private Long authorId;

}
