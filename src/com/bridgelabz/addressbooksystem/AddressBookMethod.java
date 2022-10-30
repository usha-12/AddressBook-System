package com.bridgelabz.addressbooksystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMethod {
    static Scanner sc = new Scanner(System.in);
    ArrayList<Contact> contactList = new ArrayList<>();

    public void manageAddressBook() {
        int  choice = 0;

        do {
            do {
                System.out.println("\nWhich of the following operations would you like to perform?");
                System.out.println("1. Add a New contact");
                System.out.println("2. Edit an Existing contact");
                System.out.println("3. Delete an Existing contact");
                System.out.println("4. Display the Address Book");
                System.out.println("5. Exit");
                System.out.print("\nEnter your choice : ");
                choice = sc.nextInt();

                if (!(choice >=1 && choice <= 5))
                    System.out.println("\nInvalid choice!\nPlease try again.\n");
            }while (!(choice >=1 && choice <= 5));

            switch (choice)
            {
                case 1 :
                    addContact();
                    break;

                case 2 :
                    editContact();
                    break;

                case 3 :
                    deleteContact();
                    break;

                case 4 :
                    displayAddressBook();
                    break;

                case 5 :
                    System.out.println("\nEXITED");
                    break;
            }
        }while(choice != 5);
    }

    public Contact getContactToModify(String name) {
        Contact contact = null;

        for(int i = 0; i < contactList.size(); i++) {
            Contact temp = contactList.get(i);
            if(name.equalsIgnoreCase(temp.firstName)) {
                contact = temp;
            }
        }
        return contact;
    }

    public void addContact() {
        System.out.println("\nCreating a new contact!");
        System.out.print("Enter First Name :	");
        String firstname = sc.next();
        System.out.print("Enter Last Name :	");
        String lastname = sc.next();
        System.out.print("Enter City :	");
        String city = sc.next();
        System.out.print("Enter State :	");
        String state = sc.next();
        System.out.print("Enter zip :	");
        String zip = sc.next();
        System.out.print("Enter Phone Number :	");
        String number = sc.next();
        System.out.print("Enter Email Address :	");
        String email = sc.next();
        System.out.print("Enter Address:");
        String address = sc.next();

        Contact newContact = new Contact();

        newContact.setFirstName(firstname);
        newContact.setLastName(lastname);
        newContact.setCity(city);
        newContact.setState(state);
        newContact.setZip(zip);
        newContact.setAddress(address);
        newContact.setPhoneNumber(number);
        newContact.setEmailID(email);

        contactList.add(newContact);
    }

    @Override
    public String toString() {
        return "\nAddressBook [\nContact List" + contactList + "\n]";
    }

    public void displayContact(Contact contact) {
        System.out.println(contact);
    }

    public void displayAddressBook() {
        System.out.println("\n\n------- Address Book -------");
        for (int i = 0; i < contactList.size(); i++)
            System.out.println("\n"+contactList.get(i));
        System.out.println();
    }

    public void editContact() { // collection -> group of object
        Contact contact = null;
        String name = null;

        System.out.print("\nEnter the First Name of the contact you want to edit : ");
        name = sc.next();
        while (contact == null) {
            contact = getContactToModify(name);
            if (contact == null) {
                System.out.print("\nNo such entry exists!\nPlease enter a valid First Name : ");
                name = sc.next();
                contact = getContactToModify(name);
            }
        }
        makeEdits(contact);
    }

    public void makeEdits(Contact contact) {
        int choice = 0;

        while (choice < 1 || choice > 4) {
            System.out.println("\nWhat would you like to update?");
            System.out.println("1. Name");
            System.out.println("2. Phone Number");
            System.out.println("3. Email Id");
            System.out.println("4. Address");
            System.out.print("\nEnter your choice : ");
            choice = sc.nextInt();

            if (!(choice >=1 && choice <= 4))
                System.out.println("\nInvalid choice!\nPlease try again.\n");
        }

        switch (choice) {
            case 1 :
                System.out.print("Enter the updated First Name :	");
                String firstname = sc.next();
                System.out.print("Enter the updated Last Name :	");
                String lastname = sc.next();
                contact.setFirstName(firstname);
                contact.setLastName(lastname);
                break;

            case 2 :
                System.out.print("Enter the updated Phone Number :	");
                String number = sc.next();
                contact.setPhoneNumber(number);
                break;

            case 3 :
                System.out.print("Enter the updated Email Address :	");
                String email = sc.next();
                contact.setEmailID(email);
                break;

            case 4 :
                System.out.print("Enter the updated City :	");
                String city = sc.next();
                System.out.print("Enter the updated State :	");
                String state = sc.next();
                System.out.print("Enter the updated zip :	");
                String zip = sc.next();
                contact.setCity(city);
                contact.setState(state);
                contact.setZip(zip);
                break;
        }

        System.out.println("\nIs there anything else you'd like to update?");
        System.out.print("Enter 'Yes' or 'No' : ");
        char continueEdit = sc.next().charAt(0);
        if (continueEdit == 'Y' || continueEdit == 'y') {
            makeEdits(contact);
        }
        else if (continueEdit == 'N' || continueEdit == 'n') {
            System.out.println("\n\nHere is the updated contact.");
            displayContact(contact);
        }
        else {
            System.out.println("\nInvalid Input.\nPlease try again!");
        }
    }

    public void deleteContact() {
        Contact contact = null;
        String name = null;

        System.out.print("\nEnter the First Name of the contact you want to delete : ");
        name = sc.next();
        while (contact == null) {
            contact = getContactToModify(name);
            if (contact == null) {
                System.out.println("\nNo such entry exists!\nPlease enter a valid First Name.");
                name = sc.next();
                contact = getContactToModify(name);
            }
        }
        contactList.remove(contact);
    }
}
