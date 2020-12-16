package dao;

import models.Specialty;

import java.util.List;

public interface SpecialtyDao {
    void createdSpecialty (Specialty specialty);
    Specialty readSpecialty(int id);
    void updateSpecialty(Specialty specialty);
    void deleteSpecialty(Specialty specialty);
    List getAllSpecialty ();
}
