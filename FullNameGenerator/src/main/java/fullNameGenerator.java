import java.util.Scanner;

public class fullNameGenerator {

    public static void main(String[] args) {
        // Create Scanner
        Scanner nScanner = new Scanner(System.in);
        // Create name input
        System.out.println("Please enter your name\nFirst name: ");
                String fName = nScanner.nextLine().trim();
        System.out.println("Middle name: ");
                String mName = nScanner.nextLine().trim();
        System.out.println("Last name: ");
                String lName = nScanner.nextLine().trim();
        System.out.println("Suffix: ");
                String suffix = nScanner.nextLine().trim();

        StringBuilder fullName = new StringBuilder();
        fullName.append(fName).append(" ");

        if (!mName.isEmpty()) {
            fullName.append(mName).append(" ");
        }

        fullName.append(lName);

        if (!suffix.isEmpty()) {
            fullName.append(", ").append(suffix);
        }

        // Output
        System.out.println("==================================");
        System.out.println("Full name: " + fullName);
        System.out.println("==================================");

    }
}
