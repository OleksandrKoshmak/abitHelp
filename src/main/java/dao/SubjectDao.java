package dao;

import models.Subject;

import java.util.List;

public interface SubjectDao {
    void createdSubject(Subject subject);
    Subject readSubject(int id);
    void updateSubject(Subject subject);
    void deleteSubject(Subject subject);
    List getAllSubject ();
}
