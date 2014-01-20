package com.whiteleys.zoo.dao;

import com.whiteleys.zoo.domain.Animal;

import java.util.List;

public interface AnimalDao {

    /**
     * Retrieve all the Animals for the database
     *
     * @return all the Animals
     */
    List<Animal> findAll();

}