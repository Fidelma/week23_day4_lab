package com.codeclan.course_booking_lab.CourseBookingLab.repositories.CustomerRepository;

import com.codeclan.course_booking_lab.CourseBookingLab.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom{

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Customer> findByCourse(Long courseId){
        List<Customer> result = null;

        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "b");
            cr.add(Restrictions.eq("b.course.id", courseId));
            result = cr.list();
        } catch (HibernateException ex){
            ex.printStackTrace();
        } finally {
            session.close();
        }

        return result;
    }

    @Transactional
    public List<Customer> findByTownAndCourse(String town, Long courseId){
        List<Customer> result = null;

        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "b");
            cr.add(Restrictions.eq("b.course.id", courseId));
            cr.add(Restrictions.ilike("town", town));
            result = cr.list();
        } catch (HibernateException ex){
            ex.printStackTrace();
        } finally {
            session.close();
        }

        return result;
    }

    @Transactional
    public List<Customer>findCustomersOverAgeByTownAndCourse(int age, String town, Long courseId) {
        List<Customer> result = null;

        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "b");
            cr.add(Restrictions.eq("b.course.id", courseId));
            cr.add(Restrictions.ilike("town", town));
            cr.add(Restrictions.gt("age", age));
            result = cr.list();
        } catch (HibernateException ex){
            ex.printStackTrace();
        } finally {
            session.close();
        }

        return result;
    }


}
