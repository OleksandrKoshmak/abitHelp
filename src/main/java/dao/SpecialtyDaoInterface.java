package dao;

import models.Specialty;

public interface SpecialtyDaoInterface {
    void createdSpecialty (Specialty specialty);
    Specialty readSpecialty(int id);
    void updateSpecialty(Specialty specialty);
    void deleteSpecialty(Specialty specialty);
}
