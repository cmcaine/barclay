enum PhoneLocality {
	national, international, local
}

interface PhoneValidator {

    public boolean isValid(String maybePhone);

    public double rateOf(String maybePhone);

    public PhoneLocality localityOf(String maybePhone);
}
