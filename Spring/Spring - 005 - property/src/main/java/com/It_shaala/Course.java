package com.It_shaala;
import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

@Data
@ToString
@Component
@PropertySouce("*classpath*:application.properties")
public class Course {

    @Value("${id}")
    private int id;

    @Value("${name}")
    private String name;

    @Value("${description}")
    private String description;
}
