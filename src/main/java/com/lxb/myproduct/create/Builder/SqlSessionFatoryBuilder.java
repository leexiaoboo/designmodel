package com.lxb.myproduct.create.Builder;

/**
 * 模拟 mybatis 使用 建造者模式 创建 sqlsessionFactory 工厂， 然后通过工厂模式创建 sqlsession.
 */
public class SqlSessionFatoryBuilder {

    private String url ;
    private String username;
    private String password;

    public SqlSessionFatoryBuilder setUrl(String url){
        this.url = url;
        return this;
    }

    public SqlSessionFatoryBuilder setUsername(String username){
        this.username = username;
        return this;
    }

    public SqlSessionFatoryBuilder setPassword(String password){
        this.password = password;
        return this;
    }

    public SqlSessionFatory build(){

        SqlSessionFatory sqlSessionFatory = new DefaultSqlSessionFactory();
        return sqlSessionFatory;

    }
}
