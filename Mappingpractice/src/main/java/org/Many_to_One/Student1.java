package org.Many_to_One;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Student1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;
    private LocalDate dob;
    @ManyToOne(cascade = CascadeType.ALL)
    private Mentor mentor;


}
