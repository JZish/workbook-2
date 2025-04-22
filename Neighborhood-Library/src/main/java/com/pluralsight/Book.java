package com.pluralsight;

public class Book {
    // Class properties of a book
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    // Constructor
    public Book(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;

        // Give these properties default values but don't set from the constructor
        this.setCheckedOut(false);
        this.setCheckedOutTo("");
    }

    // Method to set check-out a book that sets the appropriate variables
    // Custom Methods
    public void checkOut (String name) {
        if (!isCheckedOut) {
            // set to true using setter
            this.setCheckedOut(true);
            // set to the name passed in
            this.setCheckedOutTo(name);
            System.out.println("Book checked out to " + name);
        } else {
            System.out.println("Sorry, already checked out.");
        }
    }

    // Method to set check-in a book that sets the appropriate variables
    // Custom Methods
    public void checkIn (String name){
        // set to true using setter
        this.setCheckedOut(false);
        // set to the name passed in
        this.setCheckedOutTo(name);
    }

    // Getters and setters for all class properties
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return this.isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return this.checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }




}
