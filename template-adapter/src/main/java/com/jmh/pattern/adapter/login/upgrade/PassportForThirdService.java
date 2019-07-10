package com.jmh.pattern.adapter.login.upgrade;

import com.jmh.pattern.adapter.login.ResultData;
import com.jmh.pattern.adapter.login.upgrade.loginAdapter.LoginAdapter;
import com.jmh.pattern.adapter.login.upgrade.loginAdapter.LoginForSinaAdapter;
import com.jmh.pattern.adapter.login.upgrade.loginAdapter.LoginForWechatAdapter;

public class PassportForThirdService extends AbstractPassportForThird {
    @Override
    public ResultData loginForQQ(String qq,String password) {
        return login(qq,password);
    }

    @Override
    public ResultData loginForWechat(String openid,String password) {
        LoginForWechatAdapter adapter=new LoginForWechatAdapter();
        if(adapter.support(adapter)){
            return adapter.login(openid,password);
        }
        return null;
    }

    @Override
    public ResultData loginForSina() {
        return processLogin(LoginForSinaAdapter.class,null,null);
    }

    @Override
    public ResultData loginForToken() {
        return null;
    }

    @Override
    public ResultData loginForMobile() {
        return null;
    }

    private ResultData processLogin(Class<? extends LoginAdapter> adapterClass,String name, String password){

        try {
            //简单工厂加策略模式
            LoginAdapter loginAdapter = adapterClass.newInstance();
            if(loginAdapter.support(loginAdapter)){
                return loginAdapter.login(name,password);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
