package com.lxb.myproduct.create.factory.abstractfactory;

/**
 * 工厂生产的对象都是实现某一个接口的，面向接口编程。
 */
public class AppleFactory extends AbstarctFactory{
    @Override
    public Fuite getFuite() {
        return new AppleFuite();
    }

    @Override
    public FuiteWrapper fuiteWrapper() {
        return new AppleFuiteWrapper();
    }
}
