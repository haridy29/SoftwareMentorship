package Validation;

public class ToYearValidation extends YearValidation{
    private static Validate validate;

    protected ToYearValidation() {
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
            validate = new ToYearValidation();
        return validate;
    }
}
