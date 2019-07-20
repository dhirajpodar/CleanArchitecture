package com.example.cleanarchitecture.domain.di.module;

import com.example.cleanarchitecture.domain.beans.FruitBean;
import com.example.cleanarchitecture.domain.beans.FruitBeanImpl;
import dagger.Module;
import dagger.Provides;

@Module
public class FruitBeanImplModule {

    @Provides
    FruitBean providesMainInteractor(FruitBeanImpl fruitBean){return fruitBean;}

}
