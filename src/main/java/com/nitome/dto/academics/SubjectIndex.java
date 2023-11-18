package com.nitome.dto.academics;

import com.nitome.dto.enums.SubjectCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SubjectIndex {

    private SubjectCode name;
    private String id;
    private String icon;

    private List<ChapterIndex> chapters;
}
