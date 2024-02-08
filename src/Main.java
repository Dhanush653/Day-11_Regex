import com.bridgelabz.regex.Check;

public class Main {
    public static void main(String[] args) {
        String Password = "Abcdefghi";
        String Passwordregex = "(?=[A-Z])[A-Za-z0-9\\@\\$\\%]{8,}";
        Check pass = new Check(Password, Passwordregex);
        pass.passwordvalidator();
    }
}