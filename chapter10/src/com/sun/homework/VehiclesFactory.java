package com.sun.homework;

/**
 * ClassName: VehiclesFactory
 * Description:
 * date: 2022/3/12 17:36
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
public class VehiclesFactory {
    public static Horse getHorse() {
        return new Horse();
    }
    public static Boat getBoat() {
        return new Boat();
    }
}
