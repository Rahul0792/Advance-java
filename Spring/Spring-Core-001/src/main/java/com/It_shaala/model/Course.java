package com.It_shaala.model;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder

public class Course {
    private int id;
    private String name;
    private String description;
}
