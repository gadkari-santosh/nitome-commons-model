package com.nitome.dto;

import com.nitome.dto.enums.GradeCode;
import com.nitome.dto.enums.Offering;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
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