package Cv;

import Sections.Section;
import Sections.SectionType;
import lombok.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Setter
@Getter
@Data

public abstract class CV {
    Map<SectionType, Section> sections;


    public CV() {
        sections = new HashMap<>();
    }

    //Save at text file

    public abstract void addSection(Section section);


    public StringBuilder cvToFile() {
        StringBuilder myCV = new StringBuilder();
        for (Section section : sections.values()) {
            myCV.append(section.toString());
            myCV.append("--------------------------------------------------------------------");
        }
        return myCV;
    }
}
