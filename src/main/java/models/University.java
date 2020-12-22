package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "university")
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "linkToWebsite")
    private String linkToWebsite;
    @Column(name = "phoneNumber")
    private String phoneNumber;
    @Column(name = "email")
    private String email;
    private StudyForm studyForm;
    private boolean availableBudget;
    private boolean availableAccommodation;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "university_specialty", joinColumns = { @JoinColumn(name = "university_id") }, inverseJoinColumns = { @JoinColumn(name = "specialty_id") })
    private List<Specialty> specialtyList = new ArrayList<>();

    public University() {
    }

    public University(int id, String name, String linkToWebsite, String phoneNumber, String email, StudyForm studyForm, boolean availableBudget, boolean availableAccommodation, List<Specialty> specialtyList) {
        this.id = id;
        this.name = name;
        this.linkToWebsite = linkToWebsite;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.studyForm = studyForm;
        this.availableBudget = availableBudget;
        this.availableAccommodation = availableAccommodation;
        this.specialtyList = specialtyList;
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

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        University that = (University) o;

        if (availableBudget != that.availableBudget) return false;
        if (availableAccommodation != that.availableAccommodation) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (linkToWebsite != null ? !linkToWebsite.equals(that.linkToWebsite) : that.linkToWebsite != null)
            return false;
        if (phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        return studyForm == that.studyForm;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (linkToWebsite != null ? linkToWebsite.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (studyForm != null ? studyForm.hashCode() : 0);
        result = 31 * result + (availableBudget ? 1 : 0);
        result = 31 * result + (availableAccommodation ? 1 : 0);
        return result;
    }
}
