package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

            CellPhone myPhone = new CellPhone();

            //ask the user for the cellphonw data
            System.out.println("What is the serial number?");
            String sn = myScanner.nextLine();

            System.out.println("What is the model?");
            String model = myScanner.nextLine();

            System.out.println("Who is the carrier?");
            String carrier = myScanner.nextLine();

            System.out.println("What is the phone number?");
            String phoneNumber = myScanner.nextLine();

            System.out.println("Who is the owner?");
            String owner = myScanner.nextLine();

            //set the cellphone data on the object
            myPhone.setSerialNumber(Integer.parseInt(sn));
            myPhone.setCarrier(carrier);
            myPhone.setPhoneNumber(phoneNumber);
            myPhone.setModel(model);
            myPhone.setOwner(owner);

            //
            System.out.println("SN: " + myPhone.getSerialNumber());
            System.out.println("Model: " + myPhone.getModel());
            System.out.println("Carrier: " + myPhone.getCarrier());
            System.out.println("Phone number: " + myPhone.getPhoneNumber());
            System.out.println("Owner: " + myPhone.getOwner());




    }
}
