package com.bridgelabz.regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Check {
    String val;
    String check;

    public Check(String val, String check) {
        this.val = val;
        this.check = check;
    }
    // first name validator
    public void firstname(){
        Pattern pattern = Pattern.compile(check);
        Matcher matcher = pattern.matcher(val);
        if(matcher.matches())
        {
            System.out.println("Valid first Name");
        }
        else
            System.out.println("Not a Valid First Name");

    }
    // last name validator
    public void lastname(){
        Pattern pattern = Pattern.compile(check);
        Matcher matcher = pattern.matcher(val);

        if(matcher.matches()){
            System.out.println("Valid Last Name");
        }
        else
            System.out.println("Not a Valid Last Name");
    }
    // email validation
    public void email(){
        Pattern pattern = Pattern.compile(check);
        Matcher matcher = pattern.matcher(val);

        if(matcher.matches()){
            System.out.println("Valid Email");
        }
        else{
            System.out.println("Not a Valid Email");
        }
    }
    // Phone Number Validation
    public void phonenumber(){
        Pattern pattern = Pattern.compile(check);
        Matcher matcher = pattern.matcher(val);
        if(matcher.matches()){
            System.out.println("Its a Valid Phone Number");
        }
        else{
            System.out.println("Not a Valid Phone Number");
        }
    }
    // Password validation
    public void passwordvalidator(){
        Pattern pattern = Pattern.compile(check);
        Matcher matcher = pattern.matcher(val);
        if(matcher.matches()){
            System.out.println("It's a Valid Password");
        }
        else{
            System.out.println("It's Not a Valid Password");
        }
    }

}

