package Sections.SubSections;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Work {
    private String title;
    private String company;
    private String fromDate;
    private String toDate;
    private List<Paragraph> paragraphs;

    @Override
    public String toString() {
        String myParagraphString = "";
        for (Paragraph paragraph : paragraphs) {
            myParagraphString = myParagraphString.concat(paragraph.toString() + "\n");
        }
        return this.title + "\t\t" +
                this.fromDate + " to " + this.toDate + "\n" +
                myParagraphString;
    }
}
