package com.example.cleanarchitecture.presentation.di.component;
import com.example.cleanarchitecture.data.di.module.DatabaseImplModule;
import com.example.cleanarchitecture.data.di.module.FruitDaoImplModule;
import com.example.cleanarchitecture.domain.di.module.FruitBeanImplModule;
import com.example.cleanarchitecture.presentation.di.module.MainInteractorModule;
import com.example.cleanarchitecture.presentation.mvp.presenter.MainpresenterImpl;

import dagger.Component;


@Component(modules = {MainInteractorModule.class, FruitBeanImplModule.class, FruitDaoImplModule.class, DatabaseImplModule.class})
public interface MainPresenterImplComponent {
    MainpresenterImpl getMainPresenter();
}
