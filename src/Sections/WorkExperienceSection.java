package Sections;

import Sections.SubSections.Work;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Data

public class WorkExperienceSection extends Section {
    List<Work> works;

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
