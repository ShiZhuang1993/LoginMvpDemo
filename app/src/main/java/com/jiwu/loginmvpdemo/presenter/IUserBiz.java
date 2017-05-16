package com.jiwu.loginmvpdemo.presenter;


import com.jiwu.loginmvpdemo.Model.OnLoginListener;

/**
 *
 */
public interface IUserBiz {
   void login(String username, String password, OnLoginListener loginListener);

}