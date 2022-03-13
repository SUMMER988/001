package com.sun.homework.homework06;

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
    private static final Horse horse = new Horse();
    private VehiclesFactory() {
    }
    public static Horse getHorse() {
        return horse;
    }
    public static Boat getBoat() {
        return new Boat();
    }
    public static Plane getPlane() {
        return new Plane();
    }
}
