package Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkExperienceModel {
    private String title;
    private String company;
    private String fromDate;
    private String toDate;
    private List<String> paragraph;
    private boolean bullet;

}
