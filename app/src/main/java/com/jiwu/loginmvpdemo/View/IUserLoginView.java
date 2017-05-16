package com.jiwu.loginmvpdemo.View;


import com.jiwu.loginmvpdemo.presenter.User;

/**
 *
 */
public interface IUserLoginView {

   String getUserName();

   String getPassword();

   void showLoading();

   void hideLoading();

   void toMainActivity(User user);

   void showFailedError();

   void clearUserName();

   void clearPassword();

}