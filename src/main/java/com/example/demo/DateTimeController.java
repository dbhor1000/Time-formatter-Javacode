package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class DateTimeController {

    @GetMapping("/reformatDateTime")
    public String reformatDateTime(@RequestBody DateTimeModel dateTimeModel) {
        LocalDateTime dateTime = dateTimeModel.getDateTime();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy:MM:dd'##:'HH:mm:ss:SSS");
        return (dateTime.format(formatter) + " RU") ;
    }
}
