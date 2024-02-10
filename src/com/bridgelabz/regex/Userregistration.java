package com.bridgelabz.regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Userregistration {
    String value;
    String check;
    Scanner scanner = new Scanner(System.in);

    public Userregistration(String value, String check) {
        this.value = value;
        this.check = check;
    }

    // first name validator
    public void firstname() {
        Pattern pattern = Pattern.compile(check);
        while (true) {
            Matcher matcher = pattern.matcher(value);
            try {
                if (value == null || value.isEmpty()) {
                    throw new firstnamevalidatingException("This is a Mandatory field");
                } else if (matcher.matches()) {
                    System.out.println("Valid First Name");
                    break;
                } else {
                    System.out.println("Not a Valid First Name");
                }
            } catch (firstnamevalidatingException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Please Re-Enter A Valid First Name: ");
            value = scanner.nextLine();
        }
    }

    // last name validator
    public void lastname() {
        Pattern pattern = Pattern.compile(check);
        while (true) {
            Matcher matcher = pattern.matcher(value);
            try {
                if (value == null || value.isEmpty()) {
                    throw new LastnamevalidatingException("This is a Mandatory field");
                } else if (matcher.matches()) {
                    System.out.println("Valid Last Name");
                    break;
                } else {
                    System.out.println("Not a Valid Last Name");
                }
            } catch (LastnamevalidatingException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Please Re-Enter A Valid Last Name: ");
            value = scanner.nextLine();
        }
    }

    // email validation
    public void email() {
        Pattern pattern = Pattern.compile(check);

        while (true) {
            Matcher matcher = pattern.matcher(value);
            try {
                if (value == null || value.isEmpty()) {
                    throw new emailvalidatingException("This is a Mandatory field");
                } else if (matcher.matches()) {
                    System.out.println("Valid Email");
                    break;
                } else {
                    System.out.println("Not a Valid Email");
                }
            } catch (emailvalidatingException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Please Re-Enter A Valid Email: ");
            value = scanner.nextLine();
        }
    }

    // Phone Number Validation
    public void phonenumber() {
        Pattern pattern = Pattern.compile(check);
        while (true) {
            Matcher matcher = pattern.matcher(value);
            try {
                if (value == null || value.isEmpty()) {
                    throw new PhonevalidatingException("This is a Mandatory field");
                } else if (matcher.matches()) {
                    System.out.println("Valid Phone Number");
                    break;
                } else {
                    System.out.println("Not a Valid Phone Number");
                }
            } catch (PhonevalidatingException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Please Re-Enter A Valid Email: ");
            value = scanner.nextLine();

        }
    }

    // Password validator
    public void passwordvalidator() {
        Pattern pattern = Pattern.compile(check);
        while (true) {
            Matcher matcher = pattern.matcher(value);
            try {
                if (value == null || value.isEmpty()) {
                    throw new PasswordvalidationException("This is a Mandatory field");
                } else if (matcher.matches()) {
                    System.out.println("Valid Password");
                    break;
                } else {
                    System.out.println("Not a Valid Password");
                }
            } catch (PasswordvalidationException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Please Re-Enter A valid Password");
            value = scanner.nextLine();
        }
    }
}


