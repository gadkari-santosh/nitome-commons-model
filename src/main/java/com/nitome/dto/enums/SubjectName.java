package com.nitome.dto.enums;

public enum SubjectName {

    /* Don't change the id */
    MATHS("Maths"),
    ENGLISH("English"),
    COMPUTER("Computer"),
    GK("General Knowledge"),
    SOCIAL_SCIENCE("Social Science"),
    SCIENCE( "Science"),
    REASONING("Reasoning"),
    NVR("Non Verbal Reasoning");

    String displayName;

    private SubjectName(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}