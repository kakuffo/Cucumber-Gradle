package com.whiteleys.zoo.dao.hibernate;

import com.whiteleys.zoo.dao.UserDao;
import com.whiteleys.zoo.domain.User;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class HibernateUserDao extends HibernateDaoSupport implements UserDao {


    public void save(User user) {
        getHibernateTemplate().save(user);
    }

    public User find(String username, String password) {
        List<User> user = getHibernateTemplate().find("FROM User WHERE username = ? AND password = ?", new Object[] {username, password});
        if (user.size() == 1) {
            return user.get(0);
        }
        return null;
    }

    public boolean exists(String username) {
        return getHibernateTemplate().find("FROM User WHERE username = ?", username).size() == 1;
    }
}
