package Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EducationModel {
    String school;
    String degree;
    String fromYear;
    String toYear;
    String fos; //this member represents field of study

}
