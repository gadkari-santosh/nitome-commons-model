package com.nitome.dto.enums;

public enum GradeCode {
    R("Reception"),
    G_1("Grade 1"),
    G_2("Grade 2"),
    G_3("Grade 3"),
    G_4("Grade 4"),
    G_5("Grade 5"),
    G_6("Grade 6"),
    G_7("Grade 7"),
    G_8("Grade 8"),
    G_9("Grade 9"),
    G_10("Grade 10");

    private String name;

    GradeCode(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return name;
    }
}
