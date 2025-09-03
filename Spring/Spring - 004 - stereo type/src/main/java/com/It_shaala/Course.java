package com.It_shaala;
import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

@Data
@ToString
@Component

public class Course {

    @Value("200")
    private int id;

    @Value("tata")
    private String name;

    @Value("Hard")
    private String description;
}
