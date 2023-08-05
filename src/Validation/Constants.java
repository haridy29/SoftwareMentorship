package Validation;

final public class Constants {

    public static final String[] MONTHS = {"January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"};
    //Regex
    public static final String YEAR_REGEX = "^\\d{4}$";
    public static final String PHONE_REGEX = "^01[0-2,5]{1}[0-9]{8}$";
    public static final String LETTERSDD_REGEX = "^[A-Za-z.\\s-]+$";
    public static final String LETTERSDDA_REGEX = "^[A-Za-z.\\s-‘]+$";
    public static final String EMAIL_REGEX = "^(.+)@(.+)$";


    private Constants() {

    }
}
