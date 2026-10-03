package com.example.exercise2_jpa_relation.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false)
    private Integer age;

    @Column(nullable = false, length = 100)
    private String email;

    @Column(nullable = false)
    private Double salary;

    // One To One
    @OneToOne(mappedBy = "teacher", cascade = CascadeType.ALL)
    private Address address;

    // One To Many
    @OneToMany(mappedBy = "teacher")
    private List<Course> courses;
}