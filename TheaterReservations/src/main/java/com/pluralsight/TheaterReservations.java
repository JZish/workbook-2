package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Full Name
        System.out.print("Name: ");
            String fullName = input.nextLine().trim();

        // Showing times
        System.out.print("Date of arrival (MM/dd/yyyy: ");
            String inputDate = input.nextLine().trim();
            DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
            LocalDate showDate = LocalDate.parse(inputDate, inputFormatter);

        // # of tickets
        System.out.print("How many tickets?: ");
            int ticketCount = Integer.parseInt(input.nextLine().trim());

        // Take F.name and L.name
        String[] nameParts = fullName.split(" ");
            String firstName = nameParts[0];
            String lastName = nameParts[nameParts.length -1];

        // Build the output
        String ticketWord = (ticketCount == 1) ? "ticket" : "tickets";
        System.out.println(ticketCount + " " + ticketWord + " reserved for " + showDate + " under " + lastName + ", " + firstName);

        input.close();
    }
}
