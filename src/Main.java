import com.bridgelabz.regex.Check;

public class Main {
    public static void main(String[] args) {
        String Password = "bcde45A@Bfg";
        //.* will allow any sequence of character
        String Passwordregex = "(?=.*[0-9])(?=.*[A-Z])[A-Za-z0-9]*[\\@\\$\\%\\!\\#\\^\\&\\*\\(\\)\\-\\+][A-Za-z0-9]*";
        Check pass = new Check(Password, Passwordregex);
        pass.passwordvalidator();

    }
}