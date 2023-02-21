package Cv;

import Models.*;

import java.io.IOException;

public interface Builder {
    CV getResult();

    void addInformation(InformationModel informationModel);

    void addSummary(SummeryModel summeryModel);

    void addWorkExperience(WorkExperienceModel workExperienceModel);

    void addEducation(EducationModel educationModel);

    void addSkills(SkillModel skillModel);

    void save(String path) throws IOException;

}
