package Cv;

import Sections.Section;

public class NormalCV extends CV {
    public NormalCV() {

    }


    @Override
    public void addSection(Section section) {
        this.sections.put(section.getSectionType(), section);
    }

    @Override
    public StringBuilder cvToFile() {
        return super.cvToFile();
    }
}
