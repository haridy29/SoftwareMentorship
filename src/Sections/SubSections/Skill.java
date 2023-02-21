package Sections.SubSections;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Skill {
    String type;
    String skills;

    @Override
    public String toString() {
        return this.type + ": " + this.skills;
    }
}
