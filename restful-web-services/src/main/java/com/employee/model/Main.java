package com.employee.model;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

    private static final Scanner in = new Scanner(System.in);
    private static final String PHONE_VALID = "^\\d{9,10}$";
    private static final String EMAIL_VALID = "^[0-9A-Za-z+.%]+@[0-9A-Za-z.-]+\\.[A-Za-z]{2,4}$";

    private static int checkIntLimit(int min, int max) {
        while(true) {
            try {
                int n = Integer.parseInt(in.nextLine());
                if (n < min || n > max) {
                    throw new NumberFormatException();
                }
                return n;
            } catch (NumberFormatException e) {
                System.err.println("Re-input");
            }
        }
    }

    // private static String checkInputDate() {
    //     while(true) {
    //         String result = in.nextLine().trim();
    //         SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    //         // Date date = format.;
    //         if (result.equalsIgnoreCase(format.format(date))) {

    //         }
    //     }
    // }

    private static String checkInputPhone() {
        while(true) {
            String result = in.nextLine().trim();
            if (result.length() != 0 && result.matches(PHONE_VALID)) {
                return result;
            } else {
                System.err.println("Re-input");
            }
        }
    }

    private static String checkInputEmail() {

        while (true) {
            String result = in.nextLine().trim();
            if (result.length() != 0 && result.matches(EMAIL_VALID)) {
                return result;
            } else {
                System.err.println("Re-input");
            }
        }
    }

    private static String checkInputString() {
        while (true) {
            String result = in.nextLine().trim();
            if (result.length() == 0) {
                System.err.println("Not empty");
            } else {
                return result;
            }
        }
    }
    
    // private static String checkInputUsernam (Arr)
}
