package net.yiyutao.reflect;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author masteryi
 * @version 1.0
 **/
public class ReflectDemo {

    public static void main(String[] args) throws Exception {
        ISayGoodService sayGoodService = new SayGoodService();
        Class<? extends ISayGoodService> aClass = sayGoodService.getClass();
        System.out.println(aClass.getName());

        Class<?> forName = Class.forName("net.yiyutao.reflect.SayGoodService");
        Method[] methods = forName.getDeclaredMethods();
        for (Method method : methods) {
            if("sayGood".equalsIgnoreCase(method.getName())){
                method.invoke(sayGoodService, "masterYI");
            }
        }
        System.out.println(Arrays.toString(methods));

    }
}
