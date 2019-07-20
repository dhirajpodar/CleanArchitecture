package com.example.cleanarchitecture.presentation.di.module;

import com.example.cleanarchitecture.domain.beans.FruitBean;
import com.example.cleanarchitecture.presentation.model.MainInteractor;

import dagger.Module;
import dagger.Provides;

@Module
public class MainInteractorModule {

    @Provides
    static MainInteractor providesMainInteractor(FruitBean fruitBean){
        return new MainInteractor(fruitBean);
    }

}
