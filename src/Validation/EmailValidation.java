package Validation;

public class EmailValidation extends Validate {
    private static Validate validate;

    private EmailValidation() {
        this.regex = Constants.EMAIL_REGEX;
    }

    @Override
    public boolean isValid(String email) {
        return email.matches(regex);

    }


    @Override
    public String getPattern() {
        return "Email should be valid mail. (e.g. mohamed@example.com)";
    }
    public static Validate getInstance() {
        if (validate == null) {
            validate = new EmailValidation();
        }
        return validate;
    }
}
