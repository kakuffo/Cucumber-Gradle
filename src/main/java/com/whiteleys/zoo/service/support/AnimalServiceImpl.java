package com.whiteleys.zoo.service.support;

import com.whiteleys.zoo.dao.AnimalDao;
import com.whiteleys.zoo.domain.Animal;
import com.whiteleys.zoo.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.util.List;


public class AnimalServiceImpl implements AnimalService {

    private AnimalDao animalDao;

    public List<Animal> getAllAnimals() {
        return animalDao.findAll();
    }

    @Autowired
    public void setAnimalDao(AnimalDao animalDao) {
        this.animalDao = animalDao;
    }
}
