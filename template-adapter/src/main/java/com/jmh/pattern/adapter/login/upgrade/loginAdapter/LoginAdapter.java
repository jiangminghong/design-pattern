package com.jmh.pattern.adapter.login.upgrade.loginAdapter;

import com.jmh.pattern.adapter.login.ResultData;

public interface LoginAdapter {
    boolean support(Object object);

    ResultData login(String username,String password);
}
