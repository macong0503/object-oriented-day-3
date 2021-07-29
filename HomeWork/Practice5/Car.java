package com.hqyj.mc.HomeWork.Practice5;

import java.util.Objects;

//请使用Map集合存储自定义数据类型Car做键，对应的价格做值。
public class Car {
    private String carname;

    public Car(String carname) {
        this.carname = carname;
    }

    public Car() {
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carname='" + carname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(getCarname(), car.getCarname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCarname());
    }
}
