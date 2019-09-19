package com.codeclan.course_booking_lab.CourseBookingLab.repositories.CourseRepository;

import com.codeclan.course_booking_lab.CourseBookingLab.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {

    List<Course> findByCustomer(Long customId);
}
