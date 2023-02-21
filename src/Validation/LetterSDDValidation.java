package Validation;

//Letters and Spaces and Dots and Dashes validation
public class LetterSDDValidation extends Validate {

    public LetterSDDValidation() {
        this.regex = Constants.LETTERSDD_REGEX;
    }

    @Override
    public boolean isValid(String text) {
    return text.matches(regex);
    }

    @Override
    public String getPattern() {
        return "should have letters, spaces, dashes, and dots only.";
    }
}
