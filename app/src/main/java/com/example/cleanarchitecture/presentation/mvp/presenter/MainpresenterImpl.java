package com.example.cleanarchitecture.presentation.mvp.presenter;
import android.os.AsyncTask;

import com.example.cleanarchitecture.presentation.common.Util;
import com.example.cleanarchitecture.presentation.model.Fruit;
import com.example.cleanarchitecture.presentation.model.MainInteractor;
import com.example.cleanarchitecture.presentation.mvp.view.MainView;

import javax.inject.Inject;

public class MainpresenterImpl implements MainPresenter {

    private MainView view;
    private MainInteractor mainInteractor;

    public void setView(MainView view) {
        this.view = view;
    }

    @Inject
    public MainpresenterImpl(MainInteractor mainInteractor) {
        this.mainInteractor = mainInteractor;
    }

    @Override
    public void requestFruit() {
        new AsyncTask<Void, Void, Fruit>() {
            @Override
            protected void onPostExecute(Fruit fruit) {
                super.onPostExecute(fruit);
                view.postFruit(fruit.getName());
            }

            @Override
            protected Fruit doInBackground(Void... voids) {
                Util.simulateNetworkLatency(2000);
                return mainInteractor.getFruit();
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

}
