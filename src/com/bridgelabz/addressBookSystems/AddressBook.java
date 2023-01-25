package com.bridgelabz.addressBookSystems;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook extends Contact {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Contact> contactsArrayList = new ArrayList<Contact>();

    Contact contact = new Contact(); // create a ContactPerson object

    // Add contacts

    public void addContact() {
        System.out.println("Enter your FirstName: ");
        contact.setFirstName(scanner.next());
        System.out.println("Enter your LastName: ");
        contact.setLastName(scanner.next());
        System.out.println("Enter your Email: ");
        contact.setEmail(scanner.next());
        System.out.println("Enter your Address: ");
        contact.setAddress(scanner.next());
        System.out.println("Enter your City: ");
        contact.setCity(scanner.next());
        System.out.println("Enter your District: ");
        contact.setDistrict(scanner.next());
        System.out.println("Enter your State: ");
        contact.setState(scanner.next());
        System.out.println("Enter your Zipcode: ");
        contact.setZip(scanner.nextInt());
        System.out.println("Enter your Mobile Number: ");
        contact.setMobile(scanner.nextLong());
    }
    /*
	 * Print out on all contacts using method contact class
	 */
	/**
	 * 
	 */
	public void showContacts() {
		System.out.println(contact.toString());

        for (int i = 0; i < contactsArrayList.size(); i++) {
			Contact contacts = contactsArrayList.get(i);
			System.out.println(contacts.toString());
		}
	}
	
	public void editContact() {
		/*
		 * Ability to edit existing contact person using their
		 */
		System.out.println("Enter the First Name to Edit : ");
		String FirstName = (scanner.next());
		boolean IsAvaible = false;
        for (Contact contact : contactsArrayList) {
			if (contact.getFirstName().equals(FirstName)) {
				IsAvaible = true;

				System.out.println("Enter your FirstName: ");
				contact.setFirstName(scanner.next());
				System.out.println("Enter your LastName: ");
				contact.setLastName(scanner.next());
				System.out.println("Enter your Email: ");
				contact.setEmail(scanner.next());
				System.out.println("Enter your Address: ");
				contact.setAddress(scanner.next());
				System.out.println("Enter your City: ");
				contact.setCity(scanner.next());
				System.out.println("Enter your State: ");
				contact.setState(scanner.next());
				System.out.println("Enter your Zipcode: ");
				contact.setZip(scanner.nextInt());
				System.out.println("Enter your Mobile Number: ");
				contact.setMobile(scanner.nextLong());
			}
		}
		/*
		 * If the condition false to have printed conatct doesnt exist
		 */
		if (IsAvaible == false) {
			System.out.println("Contact Doesn't exist.");
		}
	
	}
}
