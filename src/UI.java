import Models.*;
import Validation.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UI {
    private final Scanner in;
    private Validate validate;

    public UI() {
        this.in = new Scanner(System.in);
    }


    public InformationModel addInformationUI() throws Exception {
        validate = LetterSDDAValidation.getInstance();

        System.out.println("\n\n\n\t\tAdd Information\n");
        String name, title, phone, email, address;

        while (true) {
            System.out.print("1. Enter Name: ");
            name = in.nextLine();
            if (validate.isValid(name)) break;
            System.out.println(validate.getPattern());
        }
        while (true) {
            System.out.print("2. Enter Title: ");
            title = in.nextLine();
            if (validate.isValid(title)) break;
            System.out.println(validate.getPattern());
        }

        validate = PhoneValidation.getInstance();
        while (true) {
            System.out.print("3. Phone: ");
            phone = in.nextLine();
            if (validate.isValid(phone)) break;
            System.out.println(validate.getPattern());
        }
        validate = EmailValidation.getInstance();
        while (true) {
            System.out.print("4. Email: ");
            email = in.nextLine();
            if (validate.isValid(email)) break;
            System.out.println(validate.getPattern());
        }
        System.out.print("5. Address: ");
        address = in.nextLine();
        if (doSave()) {
            return new InformationModel(name, title, phone, email, address);
        } else
            throw new Exception("Not Saved");
    }

    public SummeryModel addSummaryUI() throws Exception {
        System.out.println("\n\n\n\t\tAdd Summary\n");
        System.out.print("1. Enter paragraph: ");
        String paragraph = in.nextLine();
        if (doSave()) {
            return new SummeryModel(paragraph);
        } else
            throw new Exception("Not Saved");
    }

    public WorkExperienceModel addWorkExperienceUI() throws Exception {
        System.out.println("\n\n\n\t\tAdd Work Experience\n");
        String title, company, fromDate, toDate, paragraph, ch;
        List<String> paragraphs = new ArrayList<>();
        boolean bullet = false;
        int numOfParagraph = 0;
        validate = LetterSDDValidation.getInstance();
        while (true) {
            System.out.print("1. Title: ");
            title = in.nextLine();
            if (validate.isValid(title)) break;
            System.out.println(validate.getPattern());
        }

        System.out.print("2. Company: ");
        company = in.nextLine();
        validate = DateValidation.getInstance();
        while (true) {
            System.out.print("3. From date: ");
            fromDate = in.nextLine();
            if (validate.isValid(fromDate)) break;
            System.out.println(validate.getPattern());
        }
        validate = ToDateValidation.getInstance();
        while (true) {
            System.out.print("4. To date: ");
            toDate = in.nextLine();
            if (validate.isValid(toDate)) break;
            System.out.println(validate.getPattern());
        }
        while (true) {
            System.out.print("5. Number of paragraphs: ");
            numOfParagraph = in.nextInt();
            in.nextLine();

            if (numOfParagraph < 0)
                System.out.println("invalid input the minimum number of paragraphs is 0");
            else break;
        }

        for (int i = 0; i < numOfParagraph; i++) {
            System.out.print("Paragraph " + (i + 1) + ": ");

            paragraph = in.nextLine();
            paragraphs.add(paragraph);
        }
        while (numOfParagraph > 0) {
            System.out.print("6. Show paragraphs with bullet points [y/n]: ");
            ch = in.nextLine();
            if (!ch.equalsIgnoreCase("y") && !ch.equalsIgnoreCase("n")) {
                System.out.println("Invalid input the data should be [y/n] ");

            } else {
                if (ch.equalsIgnoreCase("y"))
                    bullet = true;
                break;
            }
        }
        if (doSave()) {
            return new WorkExperienceModel(title, company, fromDate, toDate, paragraphs, bullet);
        } else
            throw new Exception("Not Saved");
    }

    public EducationModel addEducationUI() throws Exception {
        System.out.println("\n\n\n\t\tAdd Education\n");
        String school, degree, fromYear, toYear, fOS;
        validate = LetterSDDAValidation.getInstance();
        while (true) {
            System.out.print("1. School: ");
            school = in.nextLine();
            if (validate.isValid(school)) break;
            System.out.println(validate.getPattern());
        }
        while (true) {
            System.out.print("2. Degree: ");
            degree = in.nextLine();
            if (validate.isValid(degree)) break;
            System.out.println(validate.getPattern());
        }
        validate = YearValidation.getInstance();
        while (true) {
            System.out.print("3. From year: ");
            fromYear = in.nextLine();
            if (validate.isValid(fromYear)) break;
            System.out.println(validate.getPattern());
        }
        validate = ToYearValidation.getInstance();
        while (true) {
            System.out.print("3. To year: ");
            toYear = in.nextLine();
            if (validate.isValid(toYear)) break;
            System.out.println(validate.getPattern());
        }
        validate = LetterSDDValidation.getInstance();
        while (true) {
            System.out.print("5. Field of study: ");
            fOS = in.nextLine();
            if (validate.isValid(fOS)) break;
            System.out.println(validate.getPattern());
        }
        if (doSave()) {
            return new EducationModel(school, degree, fromYear, toYear, fOS);
        } else
            throw new Exception("Not saved");
    }

    public SkillModel addSkillModel() throws Exception {
        String skillTypeName, skills;
        System.out.println("\n\n\n\t\tAdd Skills\n");
        validate = LetterSDDValidation.getInstance();
        while (true) {
            System.out.print("1. Skill type name: ");
            skillTypeName = in.nextLine();
            if (validate.isValid(skillTypeName)) break;
            System.out.println(validate.getPattern());
        }

        while (true) {
            System.out.print("2. Skills: ");
            skills = in.nextLine();

            String[] splitedSkills = skills.split(",");
            boolean valid = true;
            for (String splitedSkill : splitedSkills) {
                if (!validate.isValid(splitedSkill.trim())) {
                    valid = false;
                    break;
                }
            }
            if (!valid) {
                System.out.println(validate.getPattern());
            } else {
                break;
            }
        }
        if (doSave()) {
            return new SkillModel(skillTypeName, skills);
        } else
            throw new Exception("Not Saved");
    }

    public String cvSaveUI() throws Exception {
        while (true) {
            System.out.println("\n\n\n\t\tSave CV\n");
            System.out.print("1. Path: ");
            String path = in.nextLine();
            path.trim();
            File myfile = new File(path);
            if (myfile.isDirectory()) {
                throw new Exception("The Directory is not valid");
            }
            try {

                myfile.createNewFile();
                return path;
            } catch (IOException e) {
                throw new Exception("The Directory is not valid");

            }
        }

    }

    private boolean doSave() {
        System.out.print("Save? [y,n]: ");
        String save = in.nextLine();
        if (save.equalsIgnoreCase("y")) {
            return true;
        } else if (save.equalsIgnoreCase("n")) {
            return false;

        } else {
            System.out.println("Invalid input (y) or (n) only. ");
            return doSave();
        }
    }

}
