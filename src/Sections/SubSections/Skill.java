package Sections.SubSections;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Skill {
   private String type;
    private String skills;

    @Override
    public String toString() {
        return this.type + ": " + this.skills;
    }
}
