package com.sun.try_;

/**
 * ClassName: TryCatchDetail
 * Description:
 * date: 2022/3/14 10:54
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
public class TryCatchDetail {
    public static void main(String[] args) {
        try {
            String str = "ZZZ";
            int a = Integer.parseInt(str);
            System.out.println("数字:" + a);
        } catch (NumberFormatException e) {
            System.out.println("异常信息为" + e.getMessage());
        } finally {
            System.out.println("程序继续执行...");
        }
    }
}
