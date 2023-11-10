package com.bridgelab.java;
import java.util.*;


    class Contact {
        private String name;
        private String phoneNumber;

        public Contact(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        public String getName() {
            return name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        @Override
        public String toString() {
            return "Name: " + name + "\t\tPhone: " + phoneNumber;
        }
    }

    class AddressBook {
        private ArrayList<Contact> contacts = new ArrayList<>();

        public void addContact(String name, String phoneNumber) {
            Contact contact = new Contact(name, phoneNumber);
            contacts.add(contact);
            System.out.println("Contact added successfully.");
        }

        public void viewContacts() {
            if (contacts.isEmpty()) {
                System.out.println("Address book is empty.");
            } else {
                System.out.println("Address Book:");
                for (Contact contact : contacts) {
                    System.out.println(contact);
                }
            }
        }

        public void searchContact(String name) {
            boolean found = false;
            for (Contact contact : contacts) {
                if (contact.getName().equalsIgnoreCase(name)) {
                    System.out.println("Contact found:");
                    System.out.println(contact);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Contact not found.");
            }
        }
    }

    public class AddressBookMannagement {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            AddressBook addressBook = new AddressBook();

            while (true) {
                System.out.println("\nAddress Book Management System");
                System.out.println("1. Add Contact");
                System.out.println("2. View Contacts");
                System.out.println("3. Search Contact");
                System.out.println("4. Exit");

                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Phone Number: ");
                        String phoneNumber = scanner.nextLine();
                        addressBook.addContact(name, phoneNumber);
                        break;
                    case 2:
                        addressBook.viewContacts();
                        break;
                    case 3:
                        System.out.print("Enter Name to search: ");
                        String searchName = scanner.nextLine();
                        addressBook.searchContact(searchName);
                        break;
                    case 4:
                        System.out.println("Exiting Address Book Management System. Goodbye!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            }
        }
    }



