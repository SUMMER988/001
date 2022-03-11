package com.sun.enum_;

/**
 * ClassName: EnumExercise01
 * Description:
 * date: 2022/3/11 10:58
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
public class EnumExercise01 {
    public static void main(String[] args) {
        Gender2 boy = Gender2.BOY;//OK
        Gender2 boy2 = Gender2.BOY;//OK
        System.out.println(boy);//输出BOY
        // 本质就是调用 Gender2 的父类Enum的 toString()
//        public String toString() {
//            return name;
//        }
        System.out.println(boy2 == boy);  //True
    }
}

enum Gender2 { //父类 Enum 的toString
    BOY,
    GIRL;
}

