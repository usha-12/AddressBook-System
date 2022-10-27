package com.bridgelabz.addressbooksystem;

import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program in");
        System.out.println("You can create Contacts in the Address Book with first/last names, address, city, state, zip, phone number and email and so on");

        AddressBook entry = new AddressBook();
        entry.addContact();
    }
    public void addContact(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Create a New Contact!");
        System.out.println("Enter First name :");
        String firstName = sc.next();
        System.out.println("Enter Last Name :");
        String lastName = sc.next();
        System.out.println("Enter the city :");
        String city = sc.next();
        System.out.println("Enter the state :");
        String state = sc.next();
        System.out.println("Enter the Zip :");
        String zip = sc.next();
        System.out.println("Enter the Phone Number :");
        String phoneNumber = sc.next();
        System.out.println("Enter the EmailID :");
        String email = sc.next();
        Contact newContact = new Contact();
        Address newAddress = new Address();
        newContact.setPhoneNumber(phoneNumber);
        newContact.setEmailID(email);
        newContact.setLastName(lastName);
        newContact.setFirstName(firstName);
        newAddress.setCity(city);
        newAddress.setZip(zip);
        newAddress.setState(state);
        displayContact(newContact);
        displayAddress(newAddress);

    }
    public void displayContact(Contact contact){// contain class name and reference variable

        System.out.println(contact);// (contact object) call toString (override)
    }
    public void displayAddress(Address address){
        System.out.println(address);
    }
}
/*Ability to add a new
Contact to Address Book - Use Console to add person details from
AddressBookMain class
- Use Object-Oriented Concepts to manage
relationship between AddressBook and Contact
Person*/
