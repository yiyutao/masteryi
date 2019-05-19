package net.yiyutao.reflect;

/**
 * @author masteryi
 * @version 1.0
 * 简单工厂方法，和接口耦合，后期如果需要扩展，需要修改工厂方法
 **/
public class BeanFactory {

    /**
     * 工厂类，无需构造方法
     */
    private BeanFactory() {
    }

    public static ISayHelloService getInstance(String className) {
        if ("sayHelloService".equalsIgnoreCase(className)) {
            return new SayHelloService();
        }
        if("sayHiService".equalsIgnoreCase(className)){
            return new SayHiService();
        }
        return null;
    }


}
