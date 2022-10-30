package com.bridgelabz.addressbooksystem;

import java.util.Scanner;
public class AddressBookMain {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        AddressBookMethod entry = new AddressBookMethod();

        System.out.println("Welcome to Address Book Program in Java!");
        System.out.println("You can create and modify Contacts in the Address Book with first/last names, address, city, state, zip, phone number and email and so on");
        entry.manageAddressBook();
        entry.addContact();
        entry.manageAddressBook();

    }
}
/*Ability to add multiple
person to Address Book
- Use Console to add person details one at a time
- Use Collection Class to maintain multiple
contact persons in Address Book*/