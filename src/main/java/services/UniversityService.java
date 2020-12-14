package services;

import dao.UniversityDao;
import dao.UniversityDaoInterface;
import models.Specialty;
import models.StudyForm;
import models.Subject;
import models.University;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniversityService {
    public List<University> logicUniversityList(int specialityNumber, int zno1, int zno2, int zno3, boolean budgetForm, boolean accommodation, StudyForm studyForm) {
        UniversityDaoInterface universityDaoInterface = new UniversityDao();
        List<University> universityList = returnList();
        List<University> result = new ArrayList<>();
        for (University university : universityList) {
            if (budgetForm == university.isAvailableBudget() && accommodation == university.isAvailableAccommodation() && studyForm.equals(university.getStudyForm())) {
                for (Specialty specialty : university.getSpecialtyList()) {
                    if (specialty.getSpecialityNumber() == specialityNumber) {
                        checkSpecialty(zno1, zno2, zno3, result, university, specialty);
                    }
                }
            }
        }
        return result;
    }

    private void checkSpecialty(int zno1, int zno2, int zno3, List<University> result, University university, Specialty specialty) {
        boolean subject1 = false;
        boolean subject2 = false;
        boolean subject3 = false;
        for (Subject subject : specialty.getSubjectList()) {
            if (subject.getName().equals("Ukrainian")) {
                if (subject.getMinScore() <= zno1) {
                    subject1 = true;
                }
            }
            if (subject.getName().equals("History") || subject.getName().equals("Math")) {
                if (subject.getMinScore() <= zno2) {
                    subject2 = true;
                }
            }
            if (subject.getName().equals("Third")) {
                if (subject.getMinScore() <= zno3) {
                    subject3 = true;
                }
            }
            if (subject1 && subject2 && subject3) {
                result.add(university);
            }
        }
    }

    public List<University> returnList() {
        University university = new University(1,"DUIT","www.duit.com","09111111","doit.@gmail.com",StudyForm.FULlTIME_FORM,true,true,null);
        Subject subject1 = new Subject(1, "Ukrainian", 130);
        Subject subject2 = new Subject(2, "Math", 120);
        Subject subject3 = new Subject(3, "Third", 120);
        Specialty specialty = new Specialty(1, 111, "Law");
        specialty.setSubjectList(Arrays.asList(subject1, subject2, subject3));
        university.setSpecialtyList(Collections.singletonList(specialty));

        return Collections.singletonList(university);
    }
}


