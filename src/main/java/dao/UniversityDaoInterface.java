package dao;

import models.Specialty;
import models.Subject;
import models.University;

public interface UniversityDaoInterface {
        void createdUniversity(University university);
        University readUniversity(int id);
        void updateUniversity(University university);
        void deleteUniversity(University university);
}
