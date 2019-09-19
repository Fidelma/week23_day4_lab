package com.codeclan.course_booking_lab.CourseBookingLab.repositories.CustomerRepository;

import com.codeclan.course_booking_lab.CourseBookingLab.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> , CustomerRepositoryCustom{

//    List<Customer> findByBookingCourseId(Long id);

    List<Customer> findByCourse(Long courseId);

    List<Customer> findByTownAndCourse(String town, Long courseId);

    List<Customer>findCustomersOverAgeByTownAndCourse(int age, String town, Long courseId);



}
