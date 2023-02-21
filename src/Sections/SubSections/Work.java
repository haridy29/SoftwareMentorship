package Sections.SubSections;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Work {
    String title;
    String company;
    String fromDate;
    String toDate;
    List<Paragraph> paragraphs;

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
