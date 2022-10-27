package com.bridgelabz.addressbooksystem;

public class Address {
   private String city;
    private String state;
   private String zip;
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
    @Override
    public String toString() {
        return "\n.......Address Info........\nCity : " + city + "\nState : " + state + "\nZip : " + zip;

    }

    }