package com.lxb.myproduct.create.factory.simplefactory;

public class FuiteFactroy {

    //客户端只需要传入静态常量，就可以生产对应的水果对象。
    public static final String APPLE_TYPE = "1";
    public static final String ORACLE_TYPE = "2";
    public static final String BANANA_TYPE = "3";

    // 这种方式客户端需要传入工厂类中的类型。
    public static Fuite getFuite(String type){
       if(APPLE_TYPE.equals(type)){
           return new Apple();
       }
       if(BANANA_TYPE.equals(type)){
           return new Banana("香蕉");
       }

       return null;
    }

    //多个方法形式， 客户端不需要关心类型，但需要知道方法名字。
    public static Fuite getAppleFuite(){
        return new Apple();
    }
    public static Fuite getBananaFuite(){
        return new Banana("香蕉");
    }
}
