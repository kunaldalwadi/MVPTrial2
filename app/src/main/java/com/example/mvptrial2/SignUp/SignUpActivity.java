package com.example.mvptrial2.SignUp;

import android.os.Bundle;
import android.os.PersistableBundle;

import com.example.mvptrial2.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity implements SignUpContract.SignUpView {

    private SignUpContract.SignUpPresenter mSignUpPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.signup_activity);

        mSignUpPresenter = new SignUpPresenter(this);
    }
}
