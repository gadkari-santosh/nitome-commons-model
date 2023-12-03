package com.nitome.dto.practicetest;

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
public class PracticeTestCard {

    private Long id;

    private String authorName;

    private String image;

    private String name;

    private String subjects;

    private GradeCode grade;

    private Double avgRating;

    private Integer totalRatings;

    private Offering offering;
}