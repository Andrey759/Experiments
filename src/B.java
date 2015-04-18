import java.util.regex.Pattern;

public class B {

    public static boolean loginVerification(String login) {
        return Pattern.compile("^[a-zA-Z][a-zA-Z0-9.-]{0,18}[a-zA-Z0-9]?$").matcher(login).matches();
    }

}
