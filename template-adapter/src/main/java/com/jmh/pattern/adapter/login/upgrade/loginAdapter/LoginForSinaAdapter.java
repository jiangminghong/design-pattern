package com.jmh.pattern.adapter.login.upgrade.loginAdapter;

import com.jmh.pattern.adapter.login.ResultData;

public class LoginForSinaAdapter implements LoginAdapter {
    @Override
    public boolean support(Object object) {
        return object instanceof LoginForSinaAdapter;
    }

    @Override
    public ResultData login(String username, String password) {
        return null;
    }
}
