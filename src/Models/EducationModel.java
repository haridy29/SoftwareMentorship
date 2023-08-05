package Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EducationModel {
    private String school;
    private String degree;
    private String fromYear;
    private String toYear;
    private String fos; //this member represents field of study

}
