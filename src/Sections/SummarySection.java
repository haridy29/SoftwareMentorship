package Sections;

import Sections.SubSections.Paragraph;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SummarySection implements Section {


    Paragraph paragraph;

}
