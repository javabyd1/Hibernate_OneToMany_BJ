package com.sda.onetomany.model.dao;

import com.sda.onetomany.model.User;
import com.sda.onetomany.model.UserOrder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ModelDao {

    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    public void addUser(User user) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);

        session.getTransaction().commit();
        session.close();
    }

    public void addOrder(UserOrder order) {

        Session session = sessionFactory.openSession();

        session.beginTransaction();
        session.save(order);

        session.getTransaction().commit();
        session.close();
    }

    public void closeSession() {
        sessionFactory.close();
    }
}
