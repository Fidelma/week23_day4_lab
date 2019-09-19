package com.codeclan.course_booking_lab.CourseBookingLab.repositories.BookingRepository;

import com.codeclan.course_booking_lab.CourseBookingLab.models.Booking;
import com.codeclan.course_booking_lab.CourseBookingLab.projections.EmbedCourseAndCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryRestResource(excerptProjection = EmbedCourseAndCustomer.class)
public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findBookingsByDate(String date);
}
