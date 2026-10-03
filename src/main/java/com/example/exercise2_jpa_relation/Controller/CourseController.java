package com.example.exercise2_jpa_relation.Controller;

import com.example.exercise2_jpa_relation.API.ApiResponse;
import com.example.exercise2_jpa_relation.DTO.CourseDTO;
import com.example.exercise2_jpa_relation.Service.CourseService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/course")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;

    // Get all Course
    @GetMapping("/get")
    public ResponseEntity<?> getAllCourse() {

        return ResponseEntity.status(200).body(courseService.getAllCourse());
    }

    // Add Course
    @PostMapping("/add")
    public ResponseEntity<?> addCourse(
            @RequestBody @Valid CourseDTO courseDTO) {

        courseService.addCourse(courseDTO);

        return ResponseEntity.status(200).body(new ApiResponse("Course Add Successful"));
    }

    // Update Course
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateCourse(@PathVariable Integer id, @RequestBody @Valid CourseDTO courseDTO) {

        courseService.updateCourse(id, courseDTO);

        return ResponseEntity.status(200).body(new ApiResponse("Course Update Successful"));
    }

    // Delete Course
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteCourse(@PathVariable Integer id) {

        courseService.deleteCourse(id);

        return ResponseEntity.status(200).body(new ApiResponse("Course Delete Successful"));
    }

    // Get Teacher Name By Course ID
    @GetMapping("/teacher/{courseId}")
    public ResponseEntity<?> getTeacherNameByCourseId(@PathVariable Integer courseId) {

        return ResponseEntity.status(200).body(courseService.getTeacherNameByCourseId(courseId));
    }
}