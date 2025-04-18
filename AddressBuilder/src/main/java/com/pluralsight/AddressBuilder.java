package com.pluralsight;
import java.util.Scanner;
public class AddressBuilder {
    public static void main(String[] args) {
        // Keyboard input
        Scanner scanner = new Scanner(System.in);
        // First name input
        System.out.println("First name: ");
        String firstName = scanner.nextLine().trim();
        // Last name input
        System.out.println("Last name: ");
        String lastName = scanner.nextLine().trim();
        // Full name combiner
        StringBuilder fullName = new StringBuilder();
        fullName.append("Full Name: ").append(firstName);
        fullName.append(" ");
        fullName.append(lastName);
        // Address Info
            // Billing Street
        System.out.println("Billing Street: ");
        String billingStreet = scanner.nextLine().trim();
            // Billing City
        System.out.println("Billing City: ");
        String billingCity = scanner.nextLine().trim();
            // Billing State
        System.out.println("Billing State: ");
        String billingState = scanner.nextLine().trim();
            // Billing Zip
        System.out.println("Billing Zip: ");
        String billingZip = scanner.nextLine().trim();
            // Shipping Street
        System.out.println("Shipping Street: ");
        String shippingStreet = scanner.nextLine().trim();
            // Shipping City
        System.out.println("Shipping City: ");
        String shippingCity = scanner.nextLine().trim();
            // Shipping State
        System.out.println("Shipping State: ");
        String shippingState = scanner.nextLine().trim();
            // Shipping Zip
        System.out.println("Shipping Zip: ");
        String shippingZip = scanner.nextLine().trim();
            // Divider
        System.out.println("======================================================");
        System.out.println("======================================================");
            // Billing & Shipping Layout
        StringBuilder address = new StringBuilder();
        address.append("Billing Street: ").append(billingStreet).append("\n");
        address.append("Billing City: ").append(billingCity).append("\n");
        address.append("Billing State: ").append(billingState).append("\n");
        address.append("Billing Zip: ").append(billingZip).append("\n");
        address.append("-----------------------------------------------------------").append("\n");
        address.append("Shipping Street: ").append(shippingStreet).append("\n");
        address.append("Shipping City: ").append(shippingCity).append("\n");
        address.append("Shipping Street: ").append(shippingState).append("\n");
        address.append("Shipping Street: ").append(shippingZip).append("\n");
        // Print
        System.out.println(fullName.toString());
        System.out.println(address.toString());
    }
}
