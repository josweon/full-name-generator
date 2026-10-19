package com.pluralsight;

import java.util.*;

public class FullNameApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name\nFirst name: ");
        String input1 = scanner.nextLine();
        String firstName = input1.trim();

        System.out.println(firstName);

        System.out.print("Middle name: ");
        String input2 = scanner.nextLine();
        String middleName = input2.isEmpty() ? "" : input2.trim();

        System.out.println("middle name = " + middleName + middleName.length());

    }
}
