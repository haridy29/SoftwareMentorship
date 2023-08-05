package Sections;

import Sections.SubSections.Work;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class WorkExperienceSection extends Section {
    private List<Work> works;

    public WorkExperienceSection() {
        this.sectionType = SectionType.WORK_EXPERIENCE;
        works = new ArrayList<>();
    }

    public void addWork(Work work) {
        this.works.add(work);
    }

    @Override
    public String toString() {
        String myWorks = "Work Experience\n";
        for (Work work : works) {
            myWorks = myWorks.concat(work.toString() + "\n");
        }
        return myWorks;
    }
}
