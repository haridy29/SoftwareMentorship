package Validation;

import lombok.AllArgsConstructor;


public class PhoneValidation extends Validate {

    public PhoneValidation() {
        this.regex = Constants.PHONE_REGEX;
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
