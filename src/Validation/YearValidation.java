package Validation;

import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class YearValidation extends Validate {

    public YearValidation() {
        this.regex = Constants.YEAR_REGEX;
    }

    @Override
    public boolean isValid(String year) {
        Date currentDate = new Date();
        int currentYear = (currentDate.getYear() + 1900);

        if (year.matches(regex) && Integer.parseInt(year) <= currentYear) {
            return true;
        } else
            return false;

    }

    @Override
    public String getPattern() {
        return "Year should be numbers (e.g. 2021).";
    }
}
