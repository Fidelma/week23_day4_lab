package com.codeclan.course_booking_lab.CourseBookingLab.controllers;

import com.codeclan.course_booking_lab.CourseBookingLab.models.Course;
import com.codeclan.course_booking_lab.CourseBookingLab.repositories.CourseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/rating/{rating}")
    public List<Course> findCoursesFromRating(@PathVariable int rating){
        return courseRepository.findCoursesByRating(rating);
    }

    @GetMapping(value = "/customer/{id}")
    public List<Course> findByCustomer(@PathVariable Long id){
        return courseRepository.findByBookingsCustomerId(id);
    }


}
