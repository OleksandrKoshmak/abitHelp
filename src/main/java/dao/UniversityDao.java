package dao;

import models.University;

import java.util.List;

public interface UniversityDao {
        void createdUniversity(University university);
        University readUniversity(int id);
        void updateUniversity(University university);
        void deleteUniversity(University university);
        List getAllUniversity ();
}
