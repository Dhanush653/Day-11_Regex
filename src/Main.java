import com.bridgelabz.regex.Check;

public class Main {
    public static void main(String[] args) {
        String email = "dkk.ki@gmail.com";
        String emailregex = "[a-zA-Z0-9\\.\\_\\%\\+\\-]+[@][a-zA-Z0-9\\.\\-]+[\\.][a-zA-Z]{2,}";
        Check emailobj = new Check(email, emailregex);
        emailobj.email();
    }
}