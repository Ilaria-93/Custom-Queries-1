package com.example.customqueries.enums;

public enum StatusEnum {
    ON_TIME("On-time"),
    DELAYED("Delayed"),
    CANCELLED("Cancelled");

    private String description;

    StatusEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
