package net.yiyutao.linklist;

/**
 * @author masteryi
 * @version 1.0
 **/
public interface ILink<E> {
    void add(E e);

    Integer size();

    boolean isEmpty();

    Object[] toArray();

    E get(int index);
}
