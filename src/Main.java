import com.bridgelabz.regex.Check;

public class Main {
    public static void main(String[] args) {
        String lastname = "antony";
        String lastnameregex = "[A-Z][a-zA-Z]{2,}";

        Check name = new Check(lastname, lastnameregex);
        name.lastname();
    }
}