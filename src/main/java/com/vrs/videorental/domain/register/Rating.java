package com.vrs.videorental.domain.register;

public enum Rating {

    TWELVE(12), FIFTEEN(15), EIGHTEEN(18);

    private final int age;
    private Rating(int age) {
        this.age = age;
    }

    public int getValue() {
        return age;
    }
}
