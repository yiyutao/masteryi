package net.yiyutao.reflect;

/**
 * @author masteryi
 * @version 1.0
 **/
public class SayGoodService implements ISayGoodService{
    @Override
    public void sayGood(String name) {
        System.out.println("Good：" + name);
    }
}
