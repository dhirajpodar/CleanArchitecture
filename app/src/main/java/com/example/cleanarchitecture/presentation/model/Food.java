package com.example.cleanarchitecture.presentation.model;

public class Food {
    String name;
    public boolean equals(Object o){

        Food food = (Food) o;
        return name!=null ? name.equals(food.name): food.name ==null;
    }
}
