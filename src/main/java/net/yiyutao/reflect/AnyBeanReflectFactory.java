package net.yiyutao.reflect;

/**
 * @author masteryi
 * @version 1.0
 * 通过反射和泛型创建的工厂类，完全独立于接口
 **/
public class AnyBeanReflectFactory {

    public static <T> T getInstance(String className, Class<T> clazz) {
        T service = null;
        try {
            Class<?> aClass = Class.forName(className);
            service = (T) aClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return service;
    }
}
