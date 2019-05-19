package net.yiyutao.reflect;

/**
 * @author masteryi
 * @version 1.0
 * 利用反射实例化实现类，以后增加实现类，不用修改工厂方法，只适用于指定接口
 **/
public class BeanReflectFactory {

    public static ISayHelloService getInstance(String className) {
        ISayHelloService sayHelloService = null;
        try {
            Class<?> aClass = Class.forName(className);
            sayHelloService = (ISayHelloService) aClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sayHelloService;
    }
}
