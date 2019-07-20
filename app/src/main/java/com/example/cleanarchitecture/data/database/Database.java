package com.example.cleanarchitecture.data.database;

import com.example.cleanarchitecture.presentation.model.Fruit;

public interface Database {

    Fruit getFriutById(int id);
}
