package com.example.cleanarchitecture.data.di.module;

import com.example.cleanarchitecture.data.dao.FruitDao;
import com.example.cleanarchitecture.data.dao.FruitDaoImpl;

import dagger.Module;
import dagger.Provides;

@Module
public class FruitDaoImplModule {

    @Provides
    FruitDao providesFruitDao(FruitDaoImpl fruitDao){
        return fruitDao;
    }
}
