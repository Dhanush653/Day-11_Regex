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
    public void firstname(){
        Pattern pattern = Pattern.compile(check);
        Matcher matcher = pattern.matcher(val);

        if(matcher.matches())
        {
            System.out.println("Valid");
        }
        else
            System.out.println("Not Valid");

    }
}

