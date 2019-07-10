package com.jmh.pattern.adapter.login.old;

import com.jmh.pattern.adapter.login.ResultData;

public class SingService implements ISingService{
    @Override
    public ResultData login(String username, String password) {
        return new ResultData(null,true,"0000","success");
    }

    @Override
    public ResultData register(String mobile, String password) {
        return new ResultData(null,true,"0000","success");
    }
}
