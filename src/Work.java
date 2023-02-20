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
    Paragraph paragraphs;
}
