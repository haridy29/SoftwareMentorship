package Sections;

import Sections.SubSections.Paragraph;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class SummarySection extends Section {
    Paragraph paragraph;

    public SummarySection(Paragraph paragraph) {
        this.sectionType = SectionType.SUMMARY;
        this.paragraph = paragraph;
    }

    @Override
    public String toString() {
        return "\t\tSummary\n"
                +this.paragraph.toString() + "\n";

    }
}
