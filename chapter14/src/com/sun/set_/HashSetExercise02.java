package com.sun.set_;

import java.util.HashSet;

/**
 * ClassName: HashSetExercise02
 * Description:
 * date: 2022/3/29 00:30
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
@SuppressWarnings({"all"})
public class HashSetExercise02 {
    public static void main(String[] args) {
        HashSet<Employee0> employee0s = new HashSet<>();
        employee0s.add(new Employee0("A", 1234, "99", "03", "16"));
        employee0s.add(new Employee0("A", 1234, "99", "03", "16"));
        employee0s.add(new Employee0("A", 1234, "99", "03", "11"));
        System.out.println(employee0s.size());
        for (Employee0 employee0 : employee0s) {
            System.out.println(employee0);
        }

    }

}

class Employee0 {
    private final String name;
    private double sal;
    private final MyDate birthday;
    @Override
    public String toString() {
        return "Employee0{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
    public String getName() {
        return name;
    }
    public double getSal() {
        return sal;
    }
    public MyDate getBirthday() {
        return birthday;
    }
    @Override
    public int hashCode() {
        int res = 17;
        res = res * 31 + name.hashCode();
        res = res * 31 + birthday.year.hashCode();
        res = res * 31 + birthday.month.hashCode();
        res = res * 31 + birthday.day.hashCode();
        return res;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee0) {
            Employee0 obj1 = (Employee0) obj;
            return name.equals(obj1.getName()) && birthday.equals(obj1.birthday);
        }
        return false;
    }
    static class MyDate {
        public String year;
        public String month;
        public String day;
        public MyDate(String year, String month, String day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }
        public void setYear(String year) {
            this.year = year;
        }
        public void setMonth(String month) {
            this.month = month;
        }
        public void setDay(String day) {
            this.day = day;
        }
        public String getYear() {
            return year;
        }
        public String getMonth() {
            return month;
        }
        public String getDay() {
            return day;
        }
        @Override
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MyDate myDate = (MyDate) obj;
            String s = year + month + day;
            String myDateS = myDate.year + myDate.month + myDate.day;
            return s.equals(myDateS);
        }
        @Override
        public String toString() {
            return "MyDate{" +
                    "year='" + year + '\'' +
                    ", month='" + month + '\'' +
                    ", day='" + day + '\'' +
                    '}';
        }
    }
    public Employee0(String name, double sal, String year, String month, String day) {
        this.name = name;
        this.sal = sal;
        this.birthday = new MyDate(year, month, day);
    }
}
