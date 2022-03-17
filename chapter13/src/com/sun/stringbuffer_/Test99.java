package com.sun.stringbuffer_;

/**
 * ClassName: Test99
 * Description:
 * date: 2022/3/17 2:16
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
@SuppressWarnings({"all"})
public class Test99 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("hello");
        s.append(',');
        s.append("张三丰");
        s.append("赵敏").append(100).append(true).append(10.5);
        System.out.println(s);
        s.delete(11, 14);
        s.append("猪八戒").append("猪八戒").append("猪八戒").append("猪八戒").append("猪八戒");
        System.out.println(s);
        while (true) {
            int delIndex = s.indexOf("猪八戒");
            if (delIndex == -1) {
                break;
            }
            s.delete(delIndex, delIndex + 3);
        }
        s.replace(9, 11, "周芷若");
        System.out.println(s);

        int indexOf = s.indexOf("张三丰");
        System.out.println(indexOf);
        s.insert(indexOf + "张三丰".length(), "赵敏");
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.capacity());
    }
}
