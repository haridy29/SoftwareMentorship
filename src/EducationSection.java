import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EducationSection implements Section {
String school;
double degree;
String fromYear;
String toYear;
String fos; //this member represents field of study

}
