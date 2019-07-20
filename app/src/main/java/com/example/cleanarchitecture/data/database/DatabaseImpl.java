package com.example.cleanarchitecture.data.database;

import com.example.cleanarchitecture.presentation.model.Fruit;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class DatabaseImpl implements Database {
    private List<Fruit> fruits;

    @Inject
    public DatabaseImpl(){
        initFruits();
    }

    private void initFruits() {
        fruits = new ArrayList<>();
        fruits.add(new Fruit("Apple"));
        fruits.add(new Fruit("Blackcurrant"));
        fruits.add(new Fruit("Cherries"));
        fruits.add(new Fruit("Feijoa"));
        fruits.add(new Fruit("Guava"));
        fruits.add(new Fruit("Honeydew Melon"));
        fruits.add(new Fruit("Java-Plum"));
        fruits.add(new Fruit("Lime"));
        fruits.add(new Fruit("Lychee"));
        fruits.add(new Fruit("Mulberries"));
        fruits.add(new Fruit("Prunes"));
        fruits.add(new Fruit("Rhubarb"));
        fruits.add(new Fruit("Strawberries"));
        fruits.add(new Fruit("Tangerine"));
        fruits.add(new Fruit("Watermelon"));
    }


    @Override
    public Fruit getFriutById(int id) {
            return fruits.get(id);
    }
}
