package com.example.cleanarchitecture.presentation.model;

import com.example.cleanarchitecture.domain.beans.FruitBean;

import javax.inject.Inject;

public class MainInteractor {

    private FruitBean fruitBean;

    @Inject
    public MainInteractor(FruitBean fruitBean) {
        this.fruitBean =  fruitBean;
    }
    public Fruit getFruit(){ return fruitBean.getRandomFruit();}
}
