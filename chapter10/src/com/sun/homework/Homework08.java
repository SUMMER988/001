package com.sun.homework;

/**
 * ClassName: Homework08
 * Description:
 * date: 2022/3/13 3:27
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
public class Homework08 {
    public static void main(String[] args) {
        Color.RED.show();
    }
}

enum Color implements IColor {
    RED(255, 0, 0),
    BLUE(0, 0, 255),
    BLACK(0, 0, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0);

    private final int redValue;
    private final int greenValue;
    private final int blueValue;
    
    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }
    @Override
    public void show() {
        System.out.println(redValue + " " + greenValue
                + " " + blueValue);
    }
}

interface IColor {
    void show();
}
