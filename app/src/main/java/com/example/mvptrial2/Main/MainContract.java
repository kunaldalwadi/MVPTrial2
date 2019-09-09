package com.example.mvptrial2.Main;

import android.view.View;

public interface MainContract {

    interface MainView {

        void showSignUpScreen();

        void showSignInScreen();

    }

    interface MainPresenter {

        void handleSignUpButton(View view);

        void handleSignInButton(View view);

    }

}
