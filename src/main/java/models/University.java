package models;

import java.util.List;


public class University {
    private int id;
    private String name;
    private String linkToWebsite;
    private String phoneNumber;
    private String email;
    private StudyForm studyForm;
    private boolean availableBudget;
    private boolean availableAccommodation;

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

    public String getLinkToWebsite() {
        return linkToWebsite;
    }

    public void setLinkToWebsite(String linkToWebsite) {
        this.linkToWebsite = linkToWebsite;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public StudyForm getStudyForm() {
        return studyForm;
    }

    public void setStudyForm(StudyForm studyForm) {
        this.studyForm = studyForm;
    }

    public boolean isAvailableBudget() {
        return availableBudget;
    }

    public void setAvailableBudget(boolean availableBudget) {
        this.availableBudget = availableBudget;
    }

    public boolean isAvailableAccommodation() {
        return availableAccommodation;
    }

    public void setAvailableAccommodation(boolean availableAccommodation) {
        this.availableAccommodation = availableAccommodation;
    }

    public List<Specialty> getSpecialtyList() {
        return specialtyList;
    }

    public void setSpecialtyList(List<Specialty> specialtyList) {
        this.specialtyList = specialtyList;
    }

    private List<Specialty> specialtyList;

}
