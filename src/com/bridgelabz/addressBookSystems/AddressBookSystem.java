package com.bridgelabz.addressBookSystems;

import java.util.Scanner;

public class AddressBookSystem {
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book");
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        int Option;
        do {
            System.out.println(
                    "1. Add New Contact\n2. Edit Contact\n3. Delete Contact" + "\n4. Display Contact\n5. Exit");
            System.out.println("Enter Choice: ");
            Option = AddressBookCollection.userInput();

            switch (Option) {
                case 1:
                    AddressBookCollection.addNewAddressBook();
                    break;
                case 2:
                    AddressBookCollection.deleteAddressBook();
                    break;
                case 3:
                    AddressBookCollection.deleteAddressBook();
                    break;
                case 4:
                    AddressBookCollection.selectAddressBook();
                    break;
                default:
                    System.out.println(" !!!Invalid Input!!! ");
                    break;

            }
        } while (Option != 5);

    }
}