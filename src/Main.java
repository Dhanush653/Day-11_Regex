import com.bridgelabz.regex.Check;

public class Main {
    public static void main(String[] args) {
        String Password = "abcdefghi";
        String Passwordregex = "[A-Za-z]{8,}";
        Check pass = new Check(Password, Passwordregex);
        pass.passwordvalidator();
    }
}