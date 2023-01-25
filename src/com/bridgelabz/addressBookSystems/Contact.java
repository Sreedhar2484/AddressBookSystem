package com.bridgelabz.addressBookSystems;

public class Contact {
    public void createContact() {
        final String firstName = "Sreedhar";
        final String lastName = "Nagalli";
        final long phoneNumber = 965200248;
        final String email = "nsridhary2k@gmail.com";

        System.out.println("firstName:" + firstName);
        System.out.println("lastName:" + lastName);
        System.out.println("phoneNumber:" + phoneNumber);
        System.out.println("email:" + email);

    }

    public void address() {
        System.out.println("address of the contact is ");
        final String city = "Yemmiganur";
        final String district = "Kurnool";
        final String state = "AndhraPradesh";
        final long zip = 518360;
        System.out.println("city:" + city);
        System.out.println("District :" + district);
        System.out.println("state:" + state);
        System.out.println("zip:" + zip);

    }
}