package Sections;

import Sections.SubSections.Skill;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SkillsSection implements Section {
List<Skill> mySkills;
}
