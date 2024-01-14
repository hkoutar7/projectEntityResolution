package com.entityResolution.Model;

public class Ds2 implements IDS2   {

    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private String Street;
    private String city;

    public Ds2() {
    }
    public Ds2(int id, String firstName, String lastName, String phone, String street, String city) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        Street = street;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Ds2 :" +
                "idCitizen : " + id +
                ", firstName : " + firstName +
                ", lastName : " + lastName +
                ", phone : " + phone +
                ", Street : " + Street +
                ", city : " + city ;
    }

    public int getId() {
        return id;
    }
    public void setId(int idCitizen) {
        this.id = idCitizen;
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
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getStreet() {
        return Street;
    }
    public void setStreet(String street) {
        Street = street;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
}
