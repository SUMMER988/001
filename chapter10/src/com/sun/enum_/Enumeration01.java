// package com.sun.enum_;
//
// public class Enumeration01 {
//     public static void main(String[] args) {
//         //使用
//         Season spring = new Season("春天", "温暖");
//         Season winter = new Season("冬天", "寒冷");
//         Season summer = new Season("夏天", "炎热");
//         Season autumn = new Season("秋天", "凉爽");
//         // autumn.setName("XXX");
//         // autumn.setDesc("非常的热..");
//         // 因为对于季节而已，他的对象(具体值)，是固定的四个，不会有更多
//         // 当前这个设计类的思路，不能体现季节是固定的四个对象
//         // 因此，这样的设计不好===> 枚举类[枚: 一个一个;举：例举;
//         // 即把具体的对象一个一个例举出来的类就称为枚举类]
//         Season other = new Season("红天", "~~~");
//         System.out.println(spring);
//         System.out.println(winter);
//         System.out.println(summer);
//         System.out.println(autumn);
//         System.out.println(other);
//
//     }
// }
//
// class Season {
//     private String name;
//     private String desc;
//
//     public Season(String name, String desc) {
//         this.name = name;
//         this.desc = desc;
//     }
//     public String getName() {
//         return name;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }
//     public String getDesc() {
//         return desc;
//     }
//     public void setDesc(String desc) {
//         this.desc = desc;
//     }
//     @Override
//     public String toString() {
//         return "Season{" +
//                 "name='" + name + '\'' +
//                 ", desc='" + desc + '\'' +
//                 '}';
//     }
// }
