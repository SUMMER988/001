package com.sun.annotation_;

/**
 * ClassName: Test
 * Description:
 * date: 2022/3/11 17:30
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */

public class Fighter {
    public static void main(String[] args) {
        Card card = new Card();
    }

}

class Base {
    public int role = 5;
}

class Card extends Base {
    public Card() {
        role = 3;
        System.out.println(super.role);//为何这句话输出的是3而不是5？？
    }
}
