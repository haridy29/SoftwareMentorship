package Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkExperienceModel {
    String title;
    String company;
    String fromDate;
    String toDate;
    List<String> paragraph;
    boolean bullet;

}
