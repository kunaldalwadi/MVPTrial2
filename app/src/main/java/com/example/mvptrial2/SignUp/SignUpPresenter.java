package com.example.mvptrial2.SignUp;

public class SignUpPresenter implements SignUpContract.SignUpPresenter {

    private SignUpContract.SignUpView mSignUpView;

    public SignUpPresenter(SignUpContract.SignUpView signUpView) {
        mSignUpView = signUpView;
    }
}
