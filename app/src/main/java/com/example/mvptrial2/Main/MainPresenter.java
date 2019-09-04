package com.example.mvptrial2.Main;

public class MainPresenter implements MainContract.MainPresenter {

    private MainContract.MainView mMainView;

    public MainPresenter(MainContract.MainView mainView) {
        mMainView = mainView;
    }
}
