package com.jmh.pattern.templates.jdbc;

import java.sql.ResultSet;

public interface RowMapper<T> {


    T mapRow(ResultSet rs,int num);
}
