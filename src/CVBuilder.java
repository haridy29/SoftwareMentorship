import java.util.Scanner;

public class CVBuilder {
    private int choice;
    private final Scanner in;

    public CVBuilder() {
        this.in = new Scanner(System.in);
        this.choice = -1;
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


}
