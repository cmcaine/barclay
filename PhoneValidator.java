enum PhoneLocality {
	national, international, local
}

interface PhoneValidator {

    public static boolean isValid(String maybePhone);

    public static double rateOf(String maybePhone);

    public static PhoneLocality localityOf(String maybePhone);
}
