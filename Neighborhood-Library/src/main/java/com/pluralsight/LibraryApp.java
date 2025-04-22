package com.pluralsight;

import java.util.Scanner;

public class LibraryApp {

    static Book[] bookList = {
            new Book(1, "12345", "Ready Bro?"),
            new Book(2, "145345", "Roling Heights"),
            new Book(3, "12334545", "Echoes of Tomorrow"),
            new Book(4, "123435", "The Weight of Silence"),
            new Book(5, "12234345", "Kingdoms in Ash"),
            new Book(6, "12123345", "Designing Shadows"),
            new Book(7, "123145", "The Algorithm of Fate"),
            new Book(8, "123123445", "Notes from the 7th Floor"),
            new Book(9, "123543145", "Blueprints for Giants"),
            new Book(10, "12253345", "Songs We Never Sang"),
            new Book(11, "1212345", "Fractured Icons"),
            new Book(12, "12343145", "Diary of the Unchosen"),
            new Book(13, "1234345", "The Man Who Sketched the Sky"),
            new Book(14, "12312545", "When Gods Whisper"),
            new Book(15, "1234865", "Wired for Glory"),
            new Book(16, "1264345", "Chronicles of the Soft Hearted"),
            new Book(17, "12337545", "Muses in a Concrete Jungle"),
            new Book(18, "1236345", "The Wolf in Velvet"),
            new Book(19, "123345", "Blacklight Frequencies"),
            new Book(20, "123621345", "Threads of a Dying Star")
    };

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean appRunning = true;

        while (appRunning) {
        /*
        System.out.println(userMainMenuChoice);
         or
          */
            // Ask user what they want to do (main menu)int userMainMenuChoice = mainMenu();
            int userMainMenuChoice = mainMenu();

            switch (userMainMenuChoice) {

                case 1:
                    //call the view available books method to show the books
                    //store the selection in userBookChoice
                    int userBookChoice = viewAvailableBooks();
                    //eat the newline
                    myScanner.nextLine();
                    // user want to check out a book
                    if (userBookChoice != -1) {

                        System.out.println("What is your name?");
                        String userName = myScanner.nextLine();

                        // Check out book
                        bookList[userBookChoice].checkOut(userName);
                    }
                    break;
                case 2:
                    viewTakenBooks();
                    break;
                case 3:
                    System.out.println("See you next time!");
                    appRunning = false;
                    break;
                default:
                    System.out.println("Invalid Choice");
            }

        }

    }

    static int mainMenu() {
        System.out.println("Welcome to the library:\n");
        System.out.println("What would you like to do?");
        System.out.println("1: View available books");
        System.out.println("2: View checked out books");
        System.out.println("3: Exit Library");

        return myScanner.nextInt();
    }

    static int viewAvailableBooks() {
        System.out.println("These are the available books!\n");

        //loop over the books and work with each book
        for (int i = 0; i < bookList.length; i++) {
            //set the current book to a variable so we dont deal with i
            Book currentBook = bookList[i];
            if(!currentBook.isCheckedOut()) {
                System.out.println(i + ": " + currentBook.getTitle() + " - " + currentBook.getIsbn());
            }
        }
        myScanner.nextLine();
        //would you like to check out a book
        System.out.println("\nWould you like to check out a book? (y/n)");
        String userSelection = myScanner.nextLine();

        if (userSelection.equalsIgnoreCase("y")) {
            System.out.println("Please enter the id of the book you want to check out:");
            return myScanner.nextInt();
        }
        return -1;
    }

    static void viewTakenBooks() {
        System.out.println("\nThese are the taken books!\n");
        boolean checkedOut = false;

        for (Book book : bookList) {
            if (book.isCheckedOut()) {
                System.out.println(book.getTitle() + " - " + book.getIsbn() +
                        " (Checked out by: " + book.getCheckedOutTo() + ")");
                checkedOut = true;
            }
        }

        if (!checkedOut) {
            System.out.println("No checked out books.");
        }
    }
}
