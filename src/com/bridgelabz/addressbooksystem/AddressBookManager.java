package com.bridgelabz.addressbooksystem;

public class AddressBookManager {
    public static void main(String[] args) {
        AddressBookMain entry = new AddressBookMain();

        System.out.println("Welcome to Address Book Program in Java!");
        System.out.println("You can create and modify Contacts in the Address Book with first/last names, address, city, state, zip, phone number and email and so on");

        entry.manageAddressBookList();
        entry.displayAddressBookList();
        entry.displayAllAddressBooks();
    }
}
/*Refactor to add multiple
Address Book to the
System. Each Address Book
has a unique Name - Use Console to add new Address Book - Maintain Dictionary of Address Book Name to Address Book*/