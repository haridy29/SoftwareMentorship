package Validation;

//Lowercase, uppercase, spaces, Dots, Dashes, and Apostrophe validation.
public class LetterSDDAValidation extends Validate {

    private static Validate validate;

    private LetterSDDAValidation() {
        this.regex = Constants.LETTERSDDA_REGEX;
    }

    @Override
    public boolean isValid(String pattern) {
        return pattern.matches(regex);
    }

    @Override
    public String getPattern() {
        return "should have letters, spaces, dashes, Apostrophe, and dots only.";
    }
    public static Validate getInstance() {
        if (validate == null) {
            validate = new LetterSDDAValidation();
        }
        return validate;
    }
}
