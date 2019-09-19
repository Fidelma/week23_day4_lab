package com.codeclan.course_booking_lab.CourseBookingLab.repositories.CustomerRepository;

import com.codeclan.course_booking_lab.CourseBookingLab.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {

    List<Customer> findByCourse(Long courseId);

    List<Customer> findByTownAndCourse(String town, Long courseId);

    List<Customer>findCustomersOverAgeByTownAndCourse(int age, String town, Long courseId);
}
