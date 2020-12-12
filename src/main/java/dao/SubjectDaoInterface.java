package dao;

import models.Specialty;
import models.Subject;

public interface SubjectDaoInterface {
    void createdSubject(Subject subject);
    Subject readSubject(int id);
    void updateSubject(Subject subject);
    void deleteSubject(Subject subject);
}
