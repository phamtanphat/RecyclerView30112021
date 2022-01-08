package com.example.recyclerview30112021;

public enum DiscountSessionEnum {
    MORNING("Ăn sáng") , NOON("Ăn trưa") , NIGHT("Ăn tối") , ALL_TIME("Cả ngày");

    private final String name;

    DiscountSessionEnum(String s) {
        name = s;
    }

    public String toString() {
        return this.name;
    }
}
