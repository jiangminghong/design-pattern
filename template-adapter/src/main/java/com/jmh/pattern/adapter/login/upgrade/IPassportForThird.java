package com.jmh.pattern.adapter.login.upgrade;

import com.jmh.pattern.adapter.login.ResultData;

public interface IPassportForThird {

    ResultData loginForQQ(String qq,String password);
    ResultData loginForWechat(String openid,String password);
    ResultData loginForSina();
    ResultData loginForToken();
    ResultData loginForMobile();
}
