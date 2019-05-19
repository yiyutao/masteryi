package net.yiyutao.reflect;

/**
 * @author masteryi
 * @version 1.0
 **/
public class Main {

    public static void main(String[] args) {
        ISayHelloService sayHelloService = BeanFactory.getInstance("sayHelloService");
        if(sayHelloService != null){
            sayHelloService.sayHello("masterYI");
        }
        ISayHelloService sayHiService = BeanFactory.getInstance("sayHiService");
        if(sayHelloService != null){
            sayHiService.sayHello("masterYI");
        }

        ISayHelloService service = BeanReflectFactory.getInstance("net.yiyutao.reflect.SayHiService");
        service.sayHello("masterYI");

        ISayHelloService instance = AnyBeanReflectFactory.getInstance("net.yiyutao.reflect.SayHiService", ISayHelloService.class);
        instance.sayHello("masterYI");
        ISayGoodService goodService = AnyBeanReflectFactory.getInstance("net.yiyutao.reflect.SayGoodService", ISayGoodService.class);
        goodService.sayGood("masterYI");

    }
}
