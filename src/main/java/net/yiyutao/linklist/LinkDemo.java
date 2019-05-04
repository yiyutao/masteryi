package net.yiyutao.linklist;

import java.util.Arrays;

/**
 * @author masteryi
 * @version 1.0
 **/
public class LinkDemo {

//    public static void main(String[] args) {
////        Node<String> node1 = new Node<>("你好，我是1");
////        Node<String> node2 = new Node<>("你好，我是2");
////        Node<String> node3 = new Node<>("你好，我是3");
////        Node<String> node4 = new Node<>("你好，我是4");
////        Node<String> node5 = new Node<>("你好，我是5");
////        node1.setNext(node2);
////        node2.setNext(node3);
////        node3.setNext(node4);
////        node4.setNext(node5);
////        print(node1);
////
////    }
////
////    public static void print(Node node){
////        if(node != null){
////            System.out.println(node.getData());
////            Node next = node.getNext();
////            print(next);
////        }
////    }

    public static void main(String[] args) {
        ILink<String> link = new LinkImpl<>();
        System.out.println(link.isEmpty());
        link.add("1");
        link.add("2");
        System.out.println(link.size());
        System.out.println(link.isEmpty());
        Object[] o = link.toArray();
        System.out.println(Arrays.toString(o));
        System.out.println(link.get(0));
        System.out.println(link.get(1));
        System.out.println(link.get(2));
    }
}
