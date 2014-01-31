package com.whiteleys.zoo.dao.hibernate;

import com.whiteleys.zoo.dao.AnimalDao;
import com.whiteleys.zoo.domain.Animal;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class HibernateAnimalDao implements AnimalDao {

    private SessionFactory sessionFactory;

    @Transactional(readOnly = true)
    public List<Animal> findAll() {
        return sessionFactory.getCurrentSession().createCriteria(Animal.class).list();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}