package Cv;

import Sections.Section;
import Sections.SectionType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;
import java.util.TreeMap;

@Setter
@Getter
@Data

public abstract class CV {
    protected Map<SectionType, Section> sections;


    public CV() {
        sections = new TreeMap<>();
    }

    //Save at text file

    public abstract void addSection(Section section);


    public StringBuilder cvToFile() {
        StringBuilder myCV = new StringBuilder();
        for (Section section : sections.values()) {
            myCV.append(section.toString());

            myCV.append("--------------------------------------------------------------------\n");
        }

        return myCV;
    }

}
