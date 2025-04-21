package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

            CellPhone myPhone = new CellPhone();

            //ask the user for the cellphone data
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

            /*
             Print

            System.out.println("SN: " + myPhone.getSerialNumber());
            System.out.println("Model: " + myPhone.getModel());
            System.out.println("Carrier: " + myPhone.getCarrier());
            System.out.println("Phone number: " + myPhone.getPhoneNumber());
            System.out.println("Owner: " + myPhone.getOwner());
    }

             */

                //create new phone
                CellPhone burnerPhone = new CellPhone();
                burnerPhone.setPhoneNumber("888-432-4534");
                burnerPhone.setOwner("Bilony Tilfiger");

                System.out.println("----------info for myPhone----------");

                //use display method instead
                display(burnerPhone);

                //have myPhone call the burner
                myPhone.dial(burnerPhone.getPhoneNumber());

                //make a unique phone
                CellPhone thirdPhone = new CellPhone();
                thirdPhone.setOwner("Rowley");
                thirdPhone.setPhoneNumber("555-555-5555");
                thirdPhone.setCarrier("att");
                thirdPhone.setSerialNumber(123);

                thirdPhone.dial("828,514,2334");

                //display info about the thirdPhone
                display(thirdPhone);
                CellPhone fourthPhone = new CellPhone(123, "iphone26", "att", "8285142334", "Raymond Daude");


                display(fourthPhone);

    }
        static void display(CellPhone phone) {
                System.out.println("SN: " + phone.getSerialNumber());
                System.out.println("model: " + phone.getModel());
                System.out.println("Carrier: " + phone.getCarrier());
                System.out.println("Phone number: " + phone.getPhoneNumber());
                System.out.println("Owner: " + phone.getOwner());
        }
}
