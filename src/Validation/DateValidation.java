package Validation;

import static Validation.Constants.MONTHS;

public class DateValidation extends Validate {
    protected static Validate validate;

    protected DateValidation() {

    }

    @Override
    public boolean isValid(String data) {
        String[] monthYear = data.trim().split(" ");

        if (monthYear.length != 2) return false;//TODO

        Validate validate = YearValidation.getInstance();

        if (!validate.isValid(monthYear[1]))
            return false;
        for (int i = 0; i < MONTHS.length; i++) {
            if (MONTHS[i].equalsIgnoreCase(monthYear[0])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getPattern() {
        return "Date Should be like (e.g. January 2021)";
    }

    public static Validate getInstance() {
        if (validate == null) {
            validate = new DateValidation();
        }
        return validate;
    }
}
