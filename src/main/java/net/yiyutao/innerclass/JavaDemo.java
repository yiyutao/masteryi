package net.yiyutao.innerclass;

/**
 * @author masteryi
 * @version 1.0
 **/
public class JavaDemo {
    public static void main(String[] args) {
        IMessage message= string -> System.out.println("匿名内部类："+string);
        message.send("你好");

        IMessage2 message2 = IMessage2.getInstance();
        message2.send("你好");

        IMessageWrap.send(new DefaultMessage(),new NetChannel());
    }
}

interface IMessage{
    void send(String string);
}

interface IMessage2{
    void send(String str);

    static IMessage2 getInstance(){
        return str -> System.out.println("匿名内部类"+str);
    }
}

interface IMessageWrap{
    static interface IMessage{
        String getContent();
    }

    static interface IChannel{
        boolean connect();
    }

    static void  send(IMessage message,IChannel channel){
        if(channel.connect()){
            System.out.println(message.getContent());
        }else {
            System.out.println("通道未连接");
        }
    }
}

class DefaultMessage implements IMessageWrap.IMessage{

    @Override
    public String getContent() {
        return "默认消息";
    }
}

class NetChannel implements IMessageWrap.IChannel{

    @Override
    public boolean connect() {
        return true;
    }
}