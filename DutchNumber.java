import java.util.regex.Matcher;
import java.util.regex.Pattern;

// TODO: Write some real tests, then implement the match method below to get the tests to pass.

public class DutchNumber implements PhoneValidator {

    public static boolean isValid(String maybePhone) {
        return true;
    }

    public static double rateOf(String maybePhone) {
        return 4.0;
    }

    public static PhoneLocality localityOf(String maybePhone) {
        return PhoneLocality.national;
    }
}
