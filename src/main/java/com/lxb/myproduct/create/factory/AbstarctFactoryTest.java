package com.lxb.myproduct.create.factory;

import com.lxb.myproduct.create.factory.abstractfactory.AbstarctFactory;
import com.lxb.myproduct.create.factory.abstractfactory.AppleFactory;
import com.lxb.myproduct.create.factory.abstractfactory.Fuite;
import com.lxb.myproduct.create.factory.abstractfactory.FuiteWrapper;
import org.junit.Test;

public class AbstarctFactoryTest {

    @Test
    public void test(){
        //得到一个抽象工厂。如果spring项目中，一般是通过配置得到工厂
        AbstarctFactory factory = new AppleFactory();

        //得到对象
        Fuite fuite = factory.getFuite();
        //进行包装器对象。
        FuiteWrapper fuiteWrapper = factory.fuiteWrapper();
        fuiteWrapper.bag(fuite);
    }
}
