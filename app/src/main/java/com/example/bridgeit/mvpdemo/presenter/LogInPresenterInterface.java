package com.example.bridgeit.mvpdemo.presenter;

/**
 * Created by bridgeit on 20/4/17.
 */

public interface LogInPresenterInterface {

   void getLoginResponse(String emailId,String password);

    void loginSuccess(String message);

    void loginFailure(String message);

    void showProgressDialog(String message);

    void hideProgressDilaog();

}
