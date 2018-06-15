package com.vrs.videorental.domain.register;

public class Customer {

    private int code;
    private String name;
    private String dateOfBirth;

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public Customer(int code, String name, String dateOfBirth) {
        this.code = code;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }
}
