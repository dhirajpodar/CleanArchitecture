package com.example.cleanarchitecture.data.dao;
import com.example.cleanarchitecture.data.database.Database;
import com.example.cleanarchitecture.presentation.model.Fruit;

import javax.inject.Inject;

public class FruitDaoImpl implements FruitDao {

    Database database;

    @Inject
    public FruitDaoImpl(Database database) {
        this.database=database;
    }

    @Override
    public Fruit getFruitById(int id) {
        return database.getFriutById(id);
    }
}
