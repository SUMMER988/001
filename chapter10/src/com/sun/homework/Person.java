package com.sun.homework;

/**
 * ClassName: Person
 * Description:
 * date: 2022/3/12 17:38
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
public class Person {
    private String name;
    private Vehicles vehicles;
    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    public void passRiver() {
        if (vehicles == null) {
            vehicles = VehiclesFactory.getBoat();
        }
        vehicles.work();
    }
    public void common() {
        if (vehicles == null) {
            vehicles = VehiclesFactory.getHorse();
        }
        vehicles.work();
    }
}
