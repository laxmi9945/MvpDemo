package com.example.bridgeit.mvpdemo.presenter;

import android.content.Context;

import com.example.bridgeit.mvpdemo.interactor.LoginInterActor;
import com.example.bridgeit.mvpdemo.ui.LoginViewInterface;

/**
 * Created by bridgeit on 20/4/17.
 */

public class LoginPresenter implements LogInPresenterInterface {
    Context context;
    LoginViewInterface viewInterface;
    LoginInterActor interActor;

    public LoginPresenter(Context context, LoginViewInterface viewInterface) {
        this.context = context;
        this.viewInterface = viewInterface;
        interActor = new LoginInterActor(context,this);
    }

    @Override
    public void getLoginResponse(String emailId, String password) {
        interActor.getLoginResponseFromServer(emailId,password);
    }

    @Override
    public void loginSuccess(String message) {
        viewInterface.loginSuccess(message);
    }

    @Override
    public void loginFailure(String message) {
        viewInterface.loginFailure(message);
    }

    @Override
    public void showProgressDialog(String message) {
        viewInterface.showProgressDialog(message);
    }

    @Override
    public void hideProgressDilaog() {
        viewInterface.hideProgressDialog();
    }
}
