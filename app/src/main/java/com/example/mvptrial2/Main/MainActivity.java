package com.example.mvptrial2.Main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.example.mvptrial2.R;
import com.example.mvptrial2.databinding.MainActivityBinding;

public class MainActivity extends AppCompatActivity implements MainContract.MainView {

    private MainContract.MainPresenter mMainPresenter;
    private MainPresenter mPresenter;

    private Button mButtonSignIn;
    private Button mButtonSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.main_activity);

        mMainPresenter = new MainPresenter(this);

        MainActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.main_activity);
        binding.setPresenter(mPresenter);

        mButtonSignUp = findViewById(R.id.btn_signup);
        mButtonSignIn = findViewById(R.id.btn_signin);

    }

    @Override
    public void showSignUpScreen() {
        Toast.makeText(this, "Sign Up screen >>>>>>>", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showSignInScreen() {
        Toast.makeText(this, "Sign In Screen >>>>>>>", Toast.LENGTH_SHORT).show();
    }
}
