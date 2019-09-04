package com.example.mvptrial2.SignIn;

public class SignInPresenter implements SignInContract.SignInPresenter {

    private SignInContract.SignInView mSignInView;

    public SignInPresenter(SignInContract.SignInView signInView) {
        mSignInView = signInView;
    }
}
