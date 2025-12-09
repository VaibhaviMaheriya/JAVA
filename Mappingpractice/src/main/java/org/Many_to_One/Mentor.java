package org.Many_to_One;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Mentor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name ;
    private String subject;
    private Double experience;
    private Long mobile;

    @Override
    public String toString() {
        return "Mentor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", experience=" + experience +
                ", mobile=" + mobile +
                '}';
    }
}
