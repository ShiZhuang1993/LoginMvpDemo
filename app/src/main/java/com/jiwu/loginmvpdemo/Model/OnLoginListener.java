package com.jiwu.loginmvpdemo.Model;


import com.jiwu.loginmvpdemo.presenter.User;

/**
 *
 */
public interface OnLoginListener {

   void loginSuccess(User user);

   void loginFailed();

}