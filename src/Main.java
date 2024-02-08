import com.bridgelabz.regex.Userregistration;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> userinfo = new ArrayList<>();

        //First name
        System.out.println("Enter First Name: ");
        String firstname = scanner.nextLine();
        String firstnameregex = "[A-Z][a-zA-Z]{2,}";
        Userregistration name = new Userregistration(firstname, firstnameregex);
        name.firstname();
        userinfo.add(firstname);

        //Last Name
        System.out.println("Enter Last Name: ");
        String lastname = scanner.nextLine();
        String lastnameregex = "[A-Z][a-zA-Z]{2,}";
        Userregistration lname = new Userregistration(lastname, lastnameregex);
        lname.lastname();
        userinfo.add(lastname);


        //Email
        System.out.println("Enter A Email: ");
        String email = scanner.nextLine();
        String emailregex = "[a-zA-Z0-9\\.\\_\\%\\+\\-]+[@][a-zA-Z0-9\\.\\-]+[\\.][a-zA-Z]{2,}";
        Userregistration emailobj = new Userregistration(email, emailregex);
        emailobj.email();
        userinfo.add(email);


        //Phone NUmber
        System.out.println("Enter Phone Number(in format xx xxxxxxxxxx): ");
        String Phone = scanner.nextLine();
        String Phoneregex = "[0-9]{2}[ ][0-9]{10}";
        Userregistration phone = new Userregistration(Phone, Phoneregex);
        phone.phonenumber();
        userinfo.add(Phone);


        // Password
        System.out.println("Enter a Password: ");
        String Password = scanner.nextLine();
        String Passwordregex = "(?=.*[0-9])(?=.*[A-Z])[A-Za-z0-9]*[\\@\\$\\%\\!\\#\\^\\&\\*\\(\\)\\-\\+][A-Za-z0-9]*";
        Userregistration pass = new Userregistration(Password, Passwordregex);
        pass.passwordvalidator();
        userinfo.add(Password);


        System.out.println("User Data: ");
        for(String info : userinfo){
            System.out.println(info);
        }
    }
}