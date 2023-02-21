package Validation;

public class EmailValidation extends Validate {
    public EmailValidation() {
        this.regex = Constants.PHONE_REGEX;
    }

    @Override
    public boolean isValid(String email) {
        return email.matches(regex);

    }

    @Override
    public String getPattern() {
        return "Email should be valid mail. (e.g. mohamed@example.com)";
    }

}
