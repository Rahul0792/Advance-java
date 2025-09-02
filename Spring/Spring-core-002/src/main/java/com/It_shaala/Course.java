package com.It_shaala;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
@AllArgsConstructor
public class Course {
    private int id;
    private String name;
    private String description;
}
