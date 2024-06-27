package com.example.demo;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDateTime;

public class DateTimeModel {

    @JsonDeserialize(using = CustomLocalDateTimeDeserializer.class)
    private LocalDateTime dateTime;

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
