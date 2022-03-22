package com.sun.list_;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * ClassName: Test99
 * Description:
 * date: 2022/3/20 16:46
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
@SuppressWarnings({"all"})
public class Test99 {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("1999999999999999999");
        BigInteger bigInteger1 = new BigInteger("10000");
        BigInteger add = bigInteger.add(bigInteger1);
        System.out.println(add);
        BigInteger subtract = bigInteger.subtract(bigInteger1);
        System.out.println(subtract);
        BigInteger multiply = bigInteger.multiply(bigInteger1);
        System.out.println(multiply);
        BigInteger divide = bigInteger.divide(bigInteger1);
        System.out.println(divide);
        BigDecimal bigDecimal = new BigDecimal("19.9999");
        BigDecimal bigDecimal1 = new BigDecimal("1.11");
        BigDecimal divide1 = bigDecimal.divide(bigDecimal1, BigDecimal.ROUND_CEILING);
        System.out.println(divide1);

    }
}

