package Sections;

import lombok.Data;

@Data
public class EducationSection extends Section {
    String school;
    String degree;
    String fromYear;
    String toYear;
    String fos; //this member represents field of study

    public EducationSection() {
        this.sectionType = SectionType.EDUCATION;
    }

    public EducationSection(String school, String degree, String fromYear, String toYear, String fos) {
        this.school = school;
        this.degree = degree;
        this.fromYear = fromYear;
        this.toYear = toYear;
        this.fos = fos;
        this.sectionType = SectionType.EDUCATION;

    }

    @Override
    public String toString() {
        return "Education\n" +
                this.school + "\t" +
                this.fromYear + " to " + this.toYear + "\n" +
                this.degree+"\n";
    }
}
