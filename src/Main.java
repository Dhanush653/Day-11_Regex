import com.bridgelabz.regex.Check;

public class Main {
    public static void main(String[] args) {
        String firstname = "Paul";
        String firstnameregex = "[A-Z][a-zA-Z]{2,}";

        Check name = new Check(firstname, firstnameregex);
        name.firstname();
    }
}