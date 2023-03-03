package Validation;

public class PhoneValidation extends Validate {
    private static Validate validate;

    private PhoneValidation() {
        this.regex = Constants.PHONE_REGEX;
    }

    public static Validate getInstance() {
        if (validate == null) {
            validate = new PhoneValidation();
        }
        return validate;
    }

    @Override
    public boolean isValid(String phone) {
        return phone.matches(regex);

    }

    @Override
    public String getPattern() {
        return "Phone number must be valid phone number. (e.g. 01234567890)";
    }
}
