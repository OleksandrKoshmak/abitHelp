package services;

import dao.UniversityDaoImpl;
import dao.UniversityDao;
import models.Specialty;
import models.StudyForm;
import models.Subject;
import models.University;

import java.util.*;

public class UniversityService {
    public List<University> logicUniversityList(int specialityNumber, Map<String, Integer> znoResult, boolean budgetForm, boolean accommodation, StudyForm studyForm) {
        UniversityDao universityDao = new UniversityDaoImpl();
        List<University> universityList = universityDao.getAllUniversity();
        List<University> universityResult = new ArrayList<>();
        for (University university : universityList) {
            if (budgetForm == university.isAvailableBudget() && accommodation == university.isAvailableAccommodation() && studyForm.equals(university.getStudyForm())) {
                for (Specialty specialty : university.getSpecialtyList()) {
                    if (specialty.getSpecialityNumber() == specialityNumber) {
                        checkSpecialty(znoResult, universityResult, university, specialty);
                    }
                }
            }
        }
        return universityResult;
    }

    private void checkSpecialty(Map<String, Integer> znoResult, List<University> result, University university, Specialty specialty) {
        boolean subject1 = false;
        boolean subject2 = false;
        boolean subject3 = false;
        Subject ukrMova = specialty.getSubjectList().stream().filter(subject -> subject.getName().equals("Українська мова")).findFirst().orElse(null);
        Subject history = specialty.getSubjectList().stream().filter(subject -> subject.getName().equals("Історія України")).findFirst().orElse(null);
        Subject math = specialty.getSubjectList().stream().filter(subject -> subject.getName().equals("Математика")).findFirst().orElse(null);
        Subject third = specialty.getSubjectList().stream().filter(subject -> !subject.getName().equals("Українська мова") &&
                !subject.getName().equals("Математика")
                && !subject.getName().equals("Історія України")).findFirst().orElse(null);


        if (ukrMova.getMinScore() <= znoResult.get(ukrMova.getName())) {
            subject1 = true;
        }
        if (history != null && history.getMinScore() <= znoResult.get(history.getName())) {
            subject2 = true;
        }
        if (math != null && math.getMinScore() <= znoResult.get(math.getName())) {
            subject2 = true;
        }
        if (third.getMinScore() <= znoResult.get(third.getName())) {
            subject3 = true;
        }

        if (subject1 && subject2 && subject3) {
            result.add(university);
        }

    }

    public List<University> returnList() {
        University university = new University(1, "DUIT", "www.duit.com", "09111111", "doit.@gmail.com", StudyForm.FULlTIME_FORM, true, true, null);
        Subject subject1 = new Subject(1, "Ukrainian", 130);
        Subject subject2 = new Subject(2, "Math", 120);
        Subject subject3 = new Subject(3, "Third", 120);
        Specialty specialty = new Specialty(1, 111, "Law");
        specialty.setSubjectList(Arrays.asList(subject1, subject2, subject3));
        university.setSpecialtyList(Collections.singletonList(specialty));

        return Collections.singletonList(university);
    }
}


