package com.example.cleanarchitecture.presentation.mvp.view.activities;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.example.cleanarchitecture.R;
import com.example.cleanarchitecture.presentation.di.component.DaggerMainPresenterImplComponent;
import com.example.cleanarchitecture.presentation.di.component.MainPresenterImplComponent;
import com.example.cleanarchitecture.presentation.mvp.presenter.MainPresenter;
import com.example.cleanarchitecture.presentation.mvp.presenter.MainpresenterImpl;
import com.example.cleanarchitecture.presentation.mvp.view.MainView;


public class MainActivity extends AppCompatActivity implements MainView {

    private TextView fruitTv;
    private Button clickMe;
    MainPresenter mainPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.fruitTv=findViewById(R.id.fruit);
        clickMe=findViewById(R.id.button);


        MainPresenterImplComponent mainPresenterImplComponent = DaggerMainPresenterImplComponent.create();
        mainPresenter=mainPresenterImplComponent.getMainPresenter();
        ((MainpresenterImpl) mainPresenter).setView(this);

        clickMe.setOnClickListener(view -> requestFruit());


    }

    @Override
    public void requestFruit() {
        mainPresenter.requestFruit();
    }

    @Override
    public void postFruit(String fruit) {
        fruitTv.setText(fruit);
    }




}
