import com.bridgelabz.regex.Check;

public class Main {
    public static void main(String[] args) {
        String Phone = "91 1234567899";
        String Phoneregex = "[0-9]{2}[ ][0-9]{10}";
        Check phone = new Check(Phone, Phoneregex);
        phone.phonenumber();
    }
}