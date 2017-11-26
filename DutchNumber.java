import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DutchNumber implements PhoneValidator {

    public boolean isValid(String maybePhone) {
        return true;
    }

    public double rateOf(String maybePhone) {
        return 4.0;
    }

    public PhoneLocality localityOf(String maybePhone) {
        return PhoneLocality.national;
    }
}
