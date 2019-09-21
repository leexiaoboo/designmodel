package com.lxb.myproduct.create.Builder;

public class DefaultSqlSessionFactory implements  SqlSessionFatory{


    @Override
    public SqlSession getSqlSession() {
        //这里会返回sqlseesion
        System.out.print("创建sqlsession");
        return null;
    }
}
