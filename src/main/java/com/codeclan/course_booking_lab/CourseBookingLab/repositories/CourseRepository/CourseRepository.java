package com.codeclan.course_booking_lab.CourseBookingLab.repositories.CourseRepository;

import com.codeclan.course_booking_lab.CourseBookingLab.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long>  {

    List<Course> findCoursesByRating(int rating);

    List<Course> findByCustomer(Long customerId);

}
