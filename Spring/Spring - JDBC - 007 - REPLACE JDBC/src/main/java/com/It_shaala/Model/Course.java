package com.It_shaala.Model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder

public class Course {

    private int id;
    private String name ;
    private String duration;
    private  int price;
    private String description;
}
