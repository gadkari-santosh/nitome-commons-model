package com.nitome.dto.practice;

import com.nitome.dto.enums.GradeCode;
import com.nitome.dto.enums.Offering;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PracticeCard {

    private Long id;

    private String authorName;

    private String image;

    private String name;

    private String subjects;

    private GradeCode grade;

    private Double avgRating;

    private Offering offering;
}