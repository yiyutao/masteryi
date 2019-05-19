package net.yiyutao.reflect;

/**
 * @author masteryi
 * @version 1.0
 **/
public class SayHiService implements ISayHelloService {
    @Override
    public void sayHello(String name) {
        System.out.println("Hi：" + name);
    }
}
