package com.whiteleys.zoo.service;

import com.whiteleys.zoo.domain.Animal;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: jamesc
 * Date: 27-Oct-2009
 * Time: 09:31:40
 * To change this template use File | Settings | File Templates.
 */
public interface AnimalService {

    /**
     * Get the all the Animals available
     *
     * @return all the animals available
     */
    List<Animal> getAllAnimals();
}
