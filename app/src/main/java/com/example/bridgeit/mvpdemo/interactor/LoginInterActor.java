package com.example.bridgeit.mvpdemo.interactor;

import android.content.Context;

import com.example.bridgeit.mvpdemo.presenter.LogInPresenterInterface;

/**
 * Created by bridgeit on 20/4/17.
 */

public class LoginInterActor {
    Context context;
    LogInPresenterInterface presenterInterface;

    public LoginInterActor(Context context, LogInPresenterInterface presenterInterface) {
        this.context = context;
        this.presenterInterface = presenterInterface;
    }

    public void getLoginResponseFromServer(String email,String password){
        presenterInterface.showProgressDialog("Loading");
        if (true){
            presenterInterface.hideProgressDilaog();
            presenterInterface.loginSuccess("Login Success");
        }else {
            presenterInterface.hideProgressDilaog();
            presenterInterface.loginFailure("Login Failed");
        }

    }
}
