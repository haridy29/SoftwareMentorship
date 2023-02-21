package Validation;

public class ToDateValidation extends DateValidation {
    protected static Validate validate;

    protected ToDateValidation() {
        super();
    }

    @Override
    public boolean isValid(String data) {
        return data.equalsIgnoreCase("Present") || super.isValid(data);
    }

    @Override
    public String getPattern() {
        return super.getPattern() + " or Present";
    }

    public static Validate getInstance() {
        if (validate == null)
            validate = new ToDateValidation();
        return validate;
    }
}
