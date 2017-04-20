package com.example.bridgeit.mvpdemo.ui;

/**
 * Created by bridgeit on 20/4/17.
 */

public interface LoginViewInterface {

    void loginSuccess(String message);

    void loginFailure(String message);

    void showProgressDialog(String message);

    void hideProgressDialog();

}
