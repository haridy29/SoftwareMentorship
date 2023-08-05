package Validation;

public abstract class Validate {
    protected String regex;

    public boolean isValid(String data) {
        return data.matches(regex);
    }


    public abstract String getPattern();
}
