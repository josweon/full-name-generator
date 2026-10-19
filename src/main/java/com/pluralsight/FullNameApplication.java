package com.pluralsight;

import java.util.*;

public class FullNameApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name\nFirst name: ");
        String input = scanner.nextLine();
        String firstname = input.trim();

        System.out.println(firstname);
    }
}
