package org.example.entity;
import java.util.Date;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Expenditure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double value;
    private Date date;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    private String comment;
}
