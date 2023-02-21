import Sections.InformationSection;
import Validation.*;

import java.util.Scanner;

public class CVBuilder {

    private int choice;
    private final Scanner in;

    CV myCV;

    public CVBuilder() {
        this.in = new Scanner(System.in);
        this.choice = -1;
        myCV = new CV();
    }

    void mainMenu() {
        System.out.println("\t\tCV Builder\n");
        System.out.println("""
                1. Add Information.
                2. Add Summary.
                3. Add Work Experience.
                4. Add Education.
                5. Add Skills.
                6. Save CV.
                7. Exit.
                """);
        System.out.print("Choice? [1-7]: ");
        choice = in.nextInt();

        if (choice > 7 || choice < 1) {
            System.out.println("Invalid Choice");
            mainMenu();
        }

    }

    void addInformation() {
        Validate validate = new LetterSDDValidation();

        System.out.println("\t\tCV Builder\n");
        String name, title, phone, email, address;

        while (true) {
            System.out.print("1. Enter Name: ");
            name = in.nextLine();
            if (validate.isValid(name)) break;
            validate.getPattern();
        }
        while (true) {
            System.out.print("2. Enter Title: ");
            title = in.nextLine();
            if (validate.isValid(title)) break;
            validate.getPattern();
        }

        validate = new PhoneValidation();
        while (true) {
            System.out.print("3. Phone: ");
            phone = in.next();
            if (validate.isValid(phone)) break;
            validate.getPattern();
        }
        validate = new EmailValidation();
        while (true) {
            System.out.print("4. Email: ");
            email = in.next();
            if (validate.isValid(email)) break;
            validate.getPattern();
        }
        System.out.print("5. Address: ");
        address = in.nextLine();
        myCV.addSection(new InformationSection(name, title, phone, email, address));
    }



}
