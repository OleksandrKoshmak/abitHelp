package models;

import java.util.List;

public class Specialty {
    private int id;
    private int specialityNumber;
    private String name;
    private List<University> universityList;
    private List <Subject> subjectList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSpecialityNumber() {
        return specialityNumber;
    }

    public void setSpecialityNumber(int specialityNumber) {
        this.specialityNumber = specialityNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<University> getUniversityList() {
        return universityList;
    }

    public void setUniversityList(List<University> universityList) {
        this.universityList = universityList;
    }
}
