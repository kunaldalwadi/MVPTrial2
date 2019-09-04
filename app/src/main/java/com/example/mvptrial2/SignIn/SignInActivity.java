package com.example.mvptrial2.SignIn;

import android.os.Bundle;
import android.os.PersistableBundle;

import com.example.mvptrial2.R;
import com.example.mvptrial2.SignUp.SignUpContract;
import com.example.mvptrial2.SignUp.SignUpPresenter;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SignInActivity extends AppCompatActivity implements SignInContract.SignInView {

    private SignInContract.SignInPresenter mSignInPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_signin);

        mSignInPresenter = new SignInPresenter(this);
    }
}
