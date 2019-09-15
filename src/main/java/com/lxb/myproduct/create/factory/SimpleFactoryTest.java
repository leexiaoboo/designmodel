package com.lxb.myproduct.create.factory;

import com.lxb.myproduct.create.factory.simplefactory.Fuite;
import com.lxb.myproduct.create.factory.simplefactory.FuiteFactroy;
import org.junit.Test;

public class SimpleFactoryTest {

    /**
     * 1. 依赖不能加 <scope>test</scope> 才能在java 中使用
     * 2. 一般会放在 test 目录
    */
    @Test
    public void testGetFuite(){
        //得到apple
        FuiteFactroy.getFuite(FuiteFactroy.APPLE_TYPE);
        FuiteFactroy.getBananaFuite();
    }
}
