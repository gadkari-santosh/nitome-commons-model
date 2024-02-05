package com.nitome.dto.enums;

public enum Offering {
    PAID("Paid"),
    FREE("Free"),
    PREEMIUM("Preemium");

    private String name;

    Offering(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return name;
    }
}
