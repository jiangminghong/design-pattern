package com.jmh.pattern.adapter.login.old;

import com.jmh.pattern.adapter.login.ResultData;

public interface ISingService {

    ResultData login(String username, String password);

    ResultData register(String mobile,String password);
}
