package com.example.cleanarchitecture.data.dao;

import com.example.cleanarchitecture.presentation.model.Fruit;

public interface FruitDao {
    Fruit getFruitById(int id);
}
