package Validation;

//Letters and Spaces and Dots and Dashes validation
public class LetterSDDValidation extends Validate {
    private static Validate validate;

    private LetterSDDValidation() {
        this.regex = Constants.LETTERSDD_REGEX;
    }

    @Override
    public boolean isValid(String text) {
    return text.matches(regex);
    }

    public static Validate getInstance() {
        if (validate == null) {
            validate = new LetterSDDValidation();
        }
        return validate;
    }
    @Override
    public String getPattern() {
        return "should have letters, spaces, dashes, and dots only.";
    }
}
