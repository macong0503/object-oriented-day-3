package com.hqyj.mc.HomeWork.DouDiZhu;

public class preson {
    private String name;

    public preson() {
    }

    public preson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "preson{" +
                "name='" + name + '\'' +
                '}';
    }
}
