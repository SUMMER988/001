package com.sun.set_;

/**
 * ClassName: HashSetStructure
 * Description:
 * date: 2022/3/27 0:19
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
@SuppressWarnings({"all"})
public class HashSetStructure {
    public static void main(String[] args) {
        //模拟一个HashSet的底层 (HashMap 的底层结构)

        //1. 创建一个数组，数组的类型是 Node[]
        //2. 有些人，直接把 Node[] 数组称为 表
        LNode[] table = new LNode[16];

        //3. 创建结点
        LNode john = new LNode("john", null);

        table[2] = john;
        LNode jack = new LNode("jack", null);
        john.next = jack;// 将jack 结点挂载到john
        LNode rose = new LNode("Rose", null);
        jack.next = rose;// 将rose 结点挂载到jack

        LNode lucy = new LNode("lucy", null);
        table[3] = lucy; // 把lucy 放到 table表的索引为3的位置.
        System.out.println("table=" + table);

    }
}

class LNode { //结点, 存储数据, 可以指向下一个结点，从而形成链表
    Object item; //存放数据
    LNode next; // 指向下一个结点

    public LNode(Object item, LNode next) {
        this.item = item;
        this.next = next;
    }
}
