import Cv.Builder;
import Cv.NormalCVBuilder;
import Models.*;

import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Builder builder = new NormalCVBuilder();
        UI uiModel = new UI();
        while (true) {
            System.out.println("\n\n\n\t\tCv Builder\n");
            System.out.println("""
                    1. Add Information.
                    2. Add Summary.
                    3. Add Work Experience.
                    4. Add Education.
                    5. Add Skills.
                    6. Save Cv.
                    7. Exit.
                    """);

            System.out.print("Choice? [1-7]: ");
            int choice = 0;
            try {

                choice = in.nextInt();
                in.nextLine();

            } catch (Exception e) {
                in.nextLine();

                System.out.println("The input should be integer only");
            }

            if (choice > 7 || choice < 1) {
                System.out.println("Invalid Choice");
            } else if (choice == 1) {
                try {
                    InformationModel informationModel = uiModel.addInformationUI();
                    builder.addInformation(informationModel);
                } catch (Exception e) {
                    //do nothing
                }
            } else if (choice == 2) {
                try {
                    SummeryModel summeryModel = uiModel.addSummaryUI();
                    builder.addSummary(summeryModel);
                } catch (Exception e) {
                    //do nothing
                }
            } else if (choice == 3) {
                try {
                    WorkExperienceModel workExperienceModel = uiModel.addWorkExperienceUI();
                    builder.addWorkExperience(workExperienceModel);
                } catch (Exception e) {
                    //do nothing
                }
            } else if (choice == 4) {
                try {
                    EducationModel educationModel = uiModel.addEducationUI();
                    builder.addEducation(educationModel);
                } catch (Exception e) {
                    //do nothing
                }
            } else if (choice == 5) {
                try {
                    SkillModel skillModel = uiModel.addSkillModel();
                    builder.addSkills(skillModel);
                } catch (Exception e) {
                    //do nothing
                }

            } else if (choice == 6) {
                String path = null;
                try {
                    path = uiModel.cvSaveUI();
                    try {
                        builder.save(path);
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }


            } else
                break;

        }


    }
}