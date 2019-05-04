package net.yiyutao.linklist;

import java.util.Date;

/**
 * @author masteryi
 * @version 1.0
 * 单向链表，用户需要关心下个节点
 **/
public class Node<E> {

    /**
     * 数据
     */
    private E data;

    /**
     * 指向下个节点
     */
    private Node next;

    public Node(E e){
        this.data= e;
    }

    public void add(E e){
        this.data = e;
    }

    public void setNext(Node node){
        this.next=node;
    }

    public E getData(){
        return data;
    }

    public Node getNext(){
        return next;
    }


}
