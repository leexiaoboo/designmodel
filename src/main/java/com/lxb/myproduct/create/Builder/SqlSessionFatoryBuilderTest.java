package com.lxb.myproduct.create.Builder;

import org.junit.Test;

public class SqlSessionFatoryBuilderTest {

    @Test
    public void build(){

        SqlSessionFatory  sqlSessionFatory = new SqlSessionFatoryBuilder().setUrl("jdbc://mysql/127.0.0.1:3306/dbname/")
                .setUsername("username")
                .setPassword("123456")
                .build();

        SqlSession sqlSession = sqlSessionFatory.getSqlSession();
    }
}
