package com.lxb.myproduct.create.factory.abstractfactory;

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
