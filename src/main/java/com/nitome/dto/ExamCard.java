package com.nitome.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExamCard {

    private Long id;
    private String name;
    private String desc;
    private String subjects;
    private String authority;
    private String imageName; // http://neetomi.ecs.com/images/<image_name>
    private String medium;
    private String academicGroup;
}
