package com.bridgelabz.addressbooksystem;

public class Contact {
    private String firstName;
   private String lastName;
   private String phoneNumber;
   private String emailID;
   private Address address;// composition // we need to map the relationship bt two

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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

    public String getEmailID() {
        return emailID;
    }
    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    @Override
    public String toString() {
        return "\n..........Contact Info.........\nFirst Name : " + firstName + "\nLast Name : " + lastName + "\nPhone Number : "
                + phoneNumber + "\nEmail ID : " + emailID + "\nAddress : "+address;
    }
}
