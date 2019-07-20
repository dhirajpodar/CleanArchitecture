package com.example.cleanarchitecture.domain.beans;
import com.example.cleanarchitecture.data.dao.FruitDao;
import com.example.cleanarchitecture.presentation.model.Fruit;

import java.util.Random;

import javax.inject.Inject;

public class FruitBeanImpl implements FruitBean {

    private FruitDao dao;

    @Inject
    public FruitBeanImpl(FruitDao dao) {
        this.dao = dao;
    }

    @Override
    public Fruit getRandomFruit() {
        int id = new Random().nextInt(14);
        return dao.getFruitById(id);
    }
}
