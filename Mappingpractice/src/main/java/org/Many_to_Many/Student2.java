package org.Many_to_Many;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
public class Student2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer age;
    private LocalDate dob;
    @ManyToMany
    private List<Subjects> subjects = new ArrayList<>();
}
