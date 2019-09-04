package com.example.mvptrial2.Main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mvptrial2.R;

public class MainActivity extends AppCompatActivity implements MainContract.MainView {

    private MainContract.MainPresenter mMainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMainPresenter = new MainPresenter(this);
    }
}
