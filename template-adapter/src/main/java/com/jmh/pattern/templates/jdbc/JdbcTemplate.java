package com.jmh.pattern.templates.jdbc;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public abstract class JdbcTemplate {

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void executeQuery(String sql,RowMapper<?> rowMapper){

        try {
            Connection connection=this.getConnection();
            PreparedStatement preparedStatement=this.createPreparedStatement(connection,sql);
            ResultSet resultSet=preparedStatement.executeQuery();
            this.dealResult(resultSet,rowMapper);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    protected List<?> dealResult(ResultSet resultSet,RowMapper rowMapper) throws Exception{
        List<Object> re=new ArrayList<>();
        int rowNum=1;
        while (resultSet.next()){
            re.add(rowMapper.mapRow(resultSet,rowNum));
        }
        return re;
    }

    protected PreparedStatement createPreparedStatement(Connection con,String sql) throws Exception{

        return con.prepareStatement(sql);
    }

    protected Connection getConnection() throws Exception{

        return this.dataSource.getConnection();
    }

}
