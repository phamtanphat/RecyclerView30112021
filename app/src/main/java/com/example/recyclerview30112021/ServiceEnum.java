package com.example.recyclerview30112021;

public enum ServiceEnum {

    SMALL_RESTAURANT("Quán ăn nhỏ"),
    BIRTHDAY("Sinh nhật"),
    FAMILY("Gia đình"),
    GROUP("Nhóm hội"),
    BUFFET("Buffet"),
    RESTAURANT("Nhà hàng");

    private final String name;

    ServiceEnum(String s) {
        name = s;
    }

    public String toString() {
        return this.name;
    }
}