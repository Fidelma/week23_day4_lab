package com.codeclan.course_booking_lab.CourseBookingLab.repositories.CourseRepository;

import com.codeclan.course_booking_lab.CourseBookingLab.models.Course;
import com.codeclan.course_booking_lab.CourseBookingLab.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class CourseRepositoryImpl implements CourseRepositoryCustom {


    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Course> findByCustomer(Long customerId){
        List<Course> result = null;

        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Course.class);
            cr.createAlias("bookings", "b");
            cr.add(Restrictions.eq("b.customer.id", customerId));
            result = cr.list();
        } catch (HibernateException ex){
            ex.printStackTrace();
        } finally {
            session.close();
        }

        return result;
    }

}
