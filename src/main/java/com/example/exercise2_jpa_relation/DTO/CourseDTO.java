package com.example.exercise2_jpa_relation.DTO;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseDTO {

    @NotEmpty(message = "Course name must not be empty")
    private String name;

    @NotNull(message = "Teacher ID must not be null")
    @Positive(message = "Teacher ID must be positive")
    private Integer teacherId;
}