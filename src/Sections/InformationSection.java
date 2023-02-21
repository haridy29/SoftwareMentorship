package Sections;

import lombok.*;


@Data
public class InformationSection extends Section {
    private String name;
    private String title;
    private String phone;
    private String email;
    private String address;

    public InformationSection() {
        this.sectionType = SectionType.INFORMATION;
    }

    public InformationSection(String name, String title, String phone, String email, String address) {
        this.name = name;
        this.title = title;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.sectionType = SectionType.INFORMATION;

    }

    @Override
    public String toString() {
        return "\t\tInformation\n" +
                this.name + "\n" +
                this.title + "\n" +
                this.phone + "\t" + this.email + "\t" + this.address + "\n";

    }
}
