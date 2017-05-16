package com.jiwu.loginmvpdemo.presenter;


import com.jiwu.loginmvpdemo.Model.OnLoginListener;

/**
 *
 */
public class UserBiz implements IUserBiz {

   public void login(final String username, final String password, final OnLoginListener loginListener) {
      //模拟子线程耗时操作
      new Thread()
      {
         @Override
         public void run()
         {
            try
            {
               Thread.sleep(2000);
            } catch (InterruptedException e)
            {
               e.printStackTrace();
            }
            //模拟登录成功
            if ("wk".equals(username) && "123".equals(password))
            {
               User user = new User();
               user.setUsername(username);
               user.setPassword(password);
               loginListener.loginSuccess(user);
            } else
            {
               loginListener.loginFailed();
            }
         }
      }.start();
   }

}