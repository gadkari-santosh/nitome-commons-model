package com.nitome.dto.questionpapers;

import com.nitome.dto.enums.GradeCode;
import com.nitome.dto.enums.Offering;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PastPaperCard {

    private Long id;

    private String authorName;

    private String image;

    private String description;

    private String subject;

    private List<GradeCode> grades;

    private BigDecimal avgRating;

    private Offering offering;
}