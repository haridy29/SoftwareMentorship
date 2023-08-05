package Cv;

import Models.*;
import Sections.*;
import Sections.SubSections.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NormalCVBuilder implements Builder {

    private CV normalCv;

    public NormalCVBuilder() {
        normalCv = new NormalCV();
    }


    @Override
    public CV getResult() {
        return this.normalCv;
    }

    @Override
    public void addInformation(InformationModel informationModel) {
        this.normalCv.addSection(new InformationSection(informationModel.getName(), informationModel.getTitle(),
                informationModel.getPhone(), informationModel.getEmail(), informationModel.getAddress()));
    }

    @Override
    public void addSummary(SummeryModel summeryModel) {
        this.normalCv.addSection(new SummarySection(new NormalParagraph(summeryModel.getData())));
    }

    @Override
    public void addWorkExperience(WorkExperienceModel workExperienceModel) {
        if (!(this.normalCv.getSections().containsKey(SectionType.WORK_EXPERIENCE)))
            this.normalCv.addSection(new WorkExperienceSection());
        WorkExperienceSection myWorkExperienceSection = (WorkExperienceSection) this.normalCv.getSections().get(SectionType.WORK_EXPERIENCE);
        List<Paragraph> paragraphs = new ArrayList<>();

        if (workExperienceModel.isBullet()) {
            for (int i = 0; i < workExperienceModel.getParagraph().size(); i++) {
                paragraphs.add(new BulletParagraph(workExperienceModel.getParagraph().get(i)));
            }
        } else {
            for (int i = 0; i < workExperienceModel.getParagraph().size(); i++) {
                paragraphs.add(new NormalParagraph(workExperienceModel.getParagraph().get(i)));
            }
        }

        myWorkExperienceSection.addWork(new Work(workExperienceModel.getTitle(), workExperienceModel.getCompany(),
                workExperienceModel.getFromDate(), workExperienceModel.getToDate(), paragraphs));
        this.normalCv.addSection(myWorkExperienceSection);
    }

    @Override
    public void addEducation(EducationModel educationModel) {
        this.normalCv.addSection(new EducationSection(educationModel.getSchool(), educationModel.getDegree(),
                educationModel.getFromYear(), educationModel.getToYear(), educationModel.getFos()));
    }

    @Override
    public void addSkills(SkillModel skillModel) {
        if (!(this.normalCv.getSections().containsKey(SectionType.SKILLS)))
            this.normalCv.addSection(new SkillsSection());
        SkillsSection mySkillsSection = (SkillsSection) this.normalCv.getSections().get(SectionType.SKILLS);
        mySkillsSection.addSkill(new Skill(skillModel.getType(), skillModel.getSkills()));
        this.normalCv.addSection(mySkillsSection);
    }

    @Override
    public void save(String path) throws IOException {
        StringBuilder myCV = normalCv.cvToFile();
        File file = new File(path);
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(file));
            writer.write(myCV.toString());
        } finally {
            if (writer != null)
                writer.close();
        }
    }


}
