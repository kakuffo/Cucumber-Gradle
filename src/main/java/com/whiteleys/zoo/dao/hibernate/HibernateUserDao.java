package com.whiteleys.zoo.dao.hibernate;

import com.whiteleys.zoo.dao.UserDao;
import com.whiteleys.zoo.domain.User;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class HibernateUserDao implements UserDao {

    private SessionFactory sessionFactory;

    @Transactional
    public void save(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Transactional(readOnly = true)
    public User find(String username, String password) {
        List<User> user = sessionFactory.getCurrentSession()
                .createQuery("FROM User WHERE username = ? AND password = ?")
                .setParameter(0, username)
                .setParameter(1, password)
                .list();
        if (user.size() == 1) {
            return user.get(0);
        }
        return null;
    }

    @Transactional(readOnly = true)
    public boolean exists(String username) {
        return sessionFactory.getCurrentSession()
                .createQuery("FROM User WHERE username = ?")
                .setParameter(0, username)
                .list().size() == 1;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
