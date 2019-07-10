package com.jmh.pattern.adapter.login.upgrade;

import com.jmh.pattern.adapter.login.ResultData;
import com.jmh.pattern.adapter.login.old.SingService;

public abstract class AbstractPassportForThird extends SingService implements IPassportForThird {
    @Override
    public abstract ResultData loginForQQ(String qq,String password);
    @Override
    public abstract ResultData loginForWechat(String openid,String password);
    @Override
    public abstract ResultData loginForSina();
    @Override
    public abstract ResultData loginForToken();
    @Override
    public abstract ResultData loginForMobile();

}
