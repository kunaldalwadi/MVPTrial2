package com.example.mvptrial2.Main;

import android.view.View;

public class MainPresenter implements MainContract.MainPresenter {

    private MainContract.MainView mMainView;

    public MainPresenter(MainContract.MainView mainView) {
        mMainView = mainView;
    }

    @Override
    public void handleSignUpButton(View view) {
        mMainView.showSignUpScreen();
    }

    @Override
    public void handleSignInButton(View view) {
        mMainView.showSignInScreen();
    }
}
