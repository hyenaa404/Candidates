
package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author nhs
 */
public class Input {

    public static Scanner sc = new Scanner(System.in);
    
     public static int inputOption(int min, int max) {
        int rs;
        while (true) {
            try {
                rs = Integer.parseInt(sc.nextLine());
                if (rs < min || rs > max) {
                    throw new ArithmeticException("Not valid. Enter a valid number from " + min + " to " + max + ".");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Pls input a valid integer number.");
            } catch (ArithmeticException ex) {
                System.err.println(ex.getMessage());
            }
        }

        return rs;
    }

    public static String inputDate() {
        Date date;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        dateFormat.setLenient(false);
        while (true) {
            try {
                String temp = sc.nextLine();
                date = dateFormat.parse(temp);
                return date.toString();
            } catch (ParseException ex) {
                System.err.println("Wrong format date, (valid format: dd-mm-yyyy) pls try again.");
            }
        }
    }

    public static String inputId() {
        String id;
        do {
            id = sc.nextLine();
            if (!id.matches("[a-zA-Z0-9]+")) {
                System.out.println("Invalid id. Try again! ");
            }
        } while (!id.matches("[a-zA-Z0-9]+"));
        return id.toUpperCase();
    }

    public static String inputName() {
        String name;
        do {
            name = sc.nextLine();

            if (!name.matches("[a-zA-Z ]+")) {
                System.out.println("Invalid name. Please enter a valid name.");
            }
        } while (!name.matches("[a-zA-Z ]+"));
        return name;
    }

    public static String inputPhoneNumber() {
        String phoneNumber;
        while (true) {
                        try {
                            phoneNumber = sc.nextLine();
                            if (phoneNumber.length()< 10|| !phoneNumber.matches("[0-9]+")) {
                                throw new ArithmeticException("Not valid. Enter a valid phone number with minimum 10 characters.");
                            }
                            break;
                        } catch (ArithmeticException ex) {
                            System.err.println(ex.getMessage());
                        }
                    }
        return phoneNumber;
    }

    public static int inputInt() {
        int rs;
        while (true) {
                        try {
                            rs = Integer.parseInt(sc.nextLine());
                            if (rs <= 0) {
                                throw new ArithmeticException("Not valid. Enter a positive number.");
                            }
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Pls input a valid integer number.");
                        } catch (ArithmeticException ex) {
                            System.err.println(ex.getMessage());
                        }
                    }

        return rs;
    }

    public static float inputFloat() {
        float fl;
        while (true) {
                        try {
                            fl = Float.parseFloat(sc.nextLine());
                            if (fl <= 0) {
                                throw new ArithmeticException("Not valid. Enter a positive number.");
                            }
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Pls input a valid float number.");
                        } catch (ArithmeticException ex) {
                            System.err.println(ex.getMessage());
                        }
                    }
        return fl;
    }

    public static String inputEmail() {
        String email;
        do {
            email = sc.nextLine();
            if (!email.matches(".*@.*")) {
                System.out.println("Invalid email. Please enter a valid email.");
            }
        } while (!email.matches(".*@.*"));
        return email;
    }

   public static String inputString() {
        String str;
        while (true) {
            try {
                str = sc.nextLine();

                if (str.length() > 100 || str.isBlank()) {
                    throw new IllegalArgumentException("Require to input string and no more than 100 words.");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.err.print(e.getMessage());
            }
        }
        return str;
    }
    
    
    
    public static int inputYearEx() {
        int yearEx;
        while (true) {
                        try {
                            yearEx = Integer.parseInt(sc.nextLine());
                            if (yearEx < 0 || yearEx > 100) {
                                throw new ArithmeticException("Not valid. Enter year of Experience from 0 to 100.");
                            }
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Pls input a valid integer number.");
                        } catch (ArithmeticException ex) {
                            System.err.println(ex.getMessage());
                        }
                    }

        return yearEx;
    }
    
    public static String inputRankOfGraduation (){
        String rank;
        while (true){
            try{
                rank = sc.nextLine();
                if (!rank.equalsIgnoreCase("good") && !rank.equalsIgnoreCase("excelllence") && !rank.equalsIgnoreCase("fair") && !rank.equalsIgnoreCase("poor")){
                    throw new Exception("Not valid rank. ");
                }
                break;
            } catch (Exception e){
                System.err.println(e.getMessage());
            }
        }
        return rank;
    }
    public static int inputBithYear(){
        int bd;
        Date d = new Date (System.currentTimeMillis());
        while (true) {
                        try {
                            bd = Integer.parseInt(sc.nextLine());
                            if (bd < 1900 || bd > (d.getYear() + 1900)) {
                                throw new ArithmeticException("Not valid. Enter a valid year (from 1900 to current year.");
                            }
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Pls input a valid integer number.");
                        } catch (ArithmeticException ex) {
                            System.err.println(ex.getMessage());
                        }
                    }
        return bd;
    }
    
    
    public static String inputType (){
        String type;
        while (true){
            try{
                type = sc.nextLine();
                if (!type.equalsIgnoreCase("experience") && !type.equalsIgnoreCase("internship") && !type.equalsIgnoreCase("fresher")){
                    throw new Exception("Not valid type. ");
                }
                break;
            } catch (Exception e){
                System.err.println(e.getMessage());
            }
        }
        return type;
    }
    

}





