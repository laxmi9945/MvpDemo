package com.example.bridgeit.mvpdemo.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.bridgeit.mvpdemo.R;
import com.example.bridgeit.mvpdemo.presenter.LoginPresenter;

public class LogInActivity extends AppCompatActivity implements LoginViewInterface{
    LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new LoginPresenter(this,this);
        String email = "";
        String password = "";
        presenter.getLoginResponse(email,password);
    }

    @Override
    public void loginSuccess(String message) {
        if (!isFinishing()){
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void loginFailure(String message) {
        if (!isFinishing()) {
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void showProgressDialog(String message) {
        if (!isFinishing()){
            //TODO CODE FOR SHOWING PROGRESS DIALOG
        }
    }

    @Override
    public void hideProgressDialog() {
        if (!isFinishing()){
            //TODO CODE FOR HIDING PROGRESS DIALOG
        }
    }
}
