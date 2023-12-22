package com.entityResolution.Model;

import lombok.*;

@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@ToString
public class Ds1 implements  IDs{

    private int id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    public Ds1(int id, String firstName, String lastName, String phoneNumber, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    public Ds1() {

    }

}
