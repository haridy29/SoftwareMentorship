import Sections.Section;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Data

public class CV {
    List<Section> sections;

    public CV() {
        sections = new ArrayList<>();
    }

    void addSection(Section section) {
        sections.add(section);
    }

}
