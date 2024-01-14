package com.entityResolution.Model;

public class Ds1 implements  IDs{

    private int id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    public Ds1() {
    }
    public Ds1(int id, String firstName, String lastName, String phoneNumber, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Ds1 data are " +
                "id : " + id +
                ", firstName : " + firstName +
                ", lastName : " + lastName +
                ", phoneNumber : " + phoneNumber +
                ", address : " + address ;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

}
