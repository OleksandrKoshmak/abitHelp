package models;

import java.util.List;

public class Subject {
    private int id;
    private String name;
    private int minScore;
   private List <Specialty> specialtyList;

    public Subject(int id, String name, int minScore) {
        this.id = id;
        this.name = name;
        this.minScore = minScore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinScore() {
        return minScore;
    }

    public void setMinScore(int minScore) {
        this.minScore = minScore;
    }

    public List<Specialty> getSpecialtyList() {
        return specialtyList;
    }

    public void setSpecialtyList(List<Specialty> specialtyList) {
        this.specialtyList = specialtyList;
    }
}
