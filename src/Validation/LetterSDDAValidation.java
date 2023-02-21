package Validation;

//Lowercase, uppercase, spaces, Dots, Dashes, and Apostrophe validation.
public class LetterSDDAValidation extends Validate {


    public LetterSDDAValidation() {
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
}
