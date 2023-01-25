package com.bridgelabz.addressBookSystems;

import java.util.Scanner;

public class AddressBookSystem {
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book");
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        int Option;
        do {
            System.out.println(" 1. Add Contact \n 2. Display contact \n");
            System.out.println("Enter the  Number: ");

            Option = scanner.nextInt();

            switch (Option) {
                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    addressBook.showContacts();
                    break;
                case 3:
                    addressBook.editContact();
                    break;
                case 4:
                    addressBook.deleteContact();
                    break;
                default:
                    System.out.println(" !!!Invalid Input!!! ");
                    break;

            }
        } while (Option != 4);

    }
}