import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        // Scanner
        Scanner parse = new Scanner(System.in);

        // Input
        System.out.println("Enter your name: ");
        String input = parse.nextLine().trim();

        // Split input into parts
        String[] parts = input.split("\\s+");

        // Handle based on number of name parts
        if (parts.length == 2) {
            String firstName = parts[0];
            String lastName = parts[1];

            System.out.println("First name: " + firstName);
            System.out.println("Last name: " + lastName);
        } else if (parts.length == 3) {
            String firstName = parts[0];
            String middleName = parts[1];
            String lastName = parts[2];

            System.out.println("First name: " + firstName);
            System.out.println("Middle name: " + middleName);
            System.out.println("Last name: " + lastName);
        } else {
            System.out.println("Invalid name format. Please enter either:\n- First Last\n- First Middle Last");
        }

        parse.close();
    }
}