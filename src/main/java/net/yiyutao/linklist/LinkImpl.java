package net.yiyutao.linklist;

/**
 * @author masteryi
 * @version 1.0
 **/
public class LinkImpl<E> implements ILink<E> {


    private class Node {
        private E data;
        private Node next;

        private Node(E data) {
            this.data = data;
        }

        /**
         * 新增节点
         *
         * @param node 节点
         */
        private void addNode(Node node) {
            if (this.next == null) {
                this.next = node;
            } else {
                this.next.addNode(node);
            }
        }

        private void toArrayNode() {
            LinkImpl.this.returnData[LinkImpl.this.foot++] = this.data;
            if (this.next != null) {
                this.next.toArrayNode();
            }
        }

        private E get(int index){
            if(foot++==index){
                return this.data;
            }else {
                return this.next.get(index);
            }
        }

        /**
         * 返回data
         *
         * @return data
         */
        public E getData() {
            return data;
        }
    }

    private Node root;
    private Integer size = 0;
    private Integer foot = 0;
    private Object[] returnData;

    /**
     * 新增元素
     *
     * @param e 数据
     */
    @Override
    public void add(E e) {
        if (e == null) {
            return;
        }
        size++;
        Node node = new Node(e);
        if (root != null) {
            this.root.addNode(node);
        }
        if (root == null) {
            this.root = node;
        }
    }

    /**
     * 获取集合的大小
     *
     * @return int类型的大小
     */
    @Override
    public Integer size() {
        return size;
    }

    /**
     * 集合是否为空
     *
     * @return boolan类型
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 集合转数组
     *
     * @return Object[]的数组
     */
    @Override
    public Object[] toArray() {
        if (this.size == 0) {
            return null;
        }
        this.foot = 0;
        this.returnData = new Object[this.size];
        this.root.toArrayNode();
        return this.returnData;
    }

    @Override
    public E get(int index){
        if(index >=this.size){
            throw new ArrayIndexOutOfBoundsException();
        }
        foot  =0;
        return this.root.get(index);
    }
}
