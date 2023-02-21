package Sections;

import Sections.SubSections.Skill;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
public class SkillsSection extends Section {

    List<Skill> mySkills;

    public SkillsSection() {
        this.sectionType = SectionType.SKILLS;
        this.mySkills = new ArrayList<>();
    }

    public void addSkill(Skill skill) {
        mySkills.add(skill);
    }

    @Override
    public String toString() {
        String skills = "\t\tSkills\n";
        for (Skill skill : mySkills) {
            skills = skills.concat(skill.toString()+"\n");
        }
        return skills;
    }
}
