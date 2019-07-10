package com.jmh.pattern.adapter.login.upgrade.loginAdapter;

import com.jmh.pattern.adapter.login.ResultData;

public class LoginForWechatAdapter implements LoginAdapter {
    @Override
    public boolean support(Object object) {
        return object instanceof LoginForWechatAdapter;
    }

    @Override
    public ResultData login(String username, String password) {
        return null;
    }
}
