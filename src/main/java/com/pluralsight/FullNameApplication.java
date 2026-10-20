package com.pluralsight;

import java.util.*;

public class FullNameApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name\nFirst name: ");
        String firstName = getName(scanner);

        System.out.print("Middle name: ");
        String middleName = getName(scanner);

        System.out.print("Last name: ");
        String lastName = getName(scanner);

        System.out.print("Suffix: ");
        String suffix = getName(scanner);

        displayName(firstName, middleName, lastName, suffix);
    }

    public static String getName(Scanner scanner) {
        String input = scanner.nextLine();
        String name = input.trim();
        return name;
    }

    public static void displayName(String first, String middle, String last, String suffix) {
        if (middle.isEmpty() && suffix.isEmpty()){
            System.out.printf("\nFull name: %s %s\n", first, last);
        } else if (suffix.isEmpty()) {
            System.out.println("\nFull name: " + first + " " + middle + " " + last);
        } else if (middle.isEmpty()){
            System.out.println("\nFull name: " + first + " " + last + ", " + suffix);
        } else {
            System.out.printf("\nFull name: %s %s %s, %s\n", first, middle, last, suffix);
        }
    }
}
