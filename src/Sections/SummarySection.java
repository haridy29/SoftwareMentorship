package Sections;

import Sections.SubSections.Paragraph;
import lombok.Data;

@Data

public class SummarySection extends Section {
    private Paragraph paragraph;

    public SummarySection(Paragraph paragraph) {
        this.sectionType = SectionType.SUMMARY;
        this.paragraph = paragraph;
    }

    @Override
    public String toString() {
        return "Summary\n"
                +this.paragraph.toString() + "\n";

    }
}
