package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "specialty")
public class Specialty {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "specialtyNumber")
    private int specialtyNumber;

    @Column(name = "name")
    private String name;

    @ManyToMany(fetch = FetchType.LAZY,mappedBy="specialtyList")
    private List<University> universityList;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "specialty_subject", joinColumns = { @JoinColumn(name = "specialty_id")},
            inverseJoinColumns = { @JoinColumn(name = "subject_id", referencedColumnName = "id") })
    private List<Subject> subjectList = new ArrayList<>();


    public Specialty() {
    }

    public Specialty(int id, int specialtyNumber, String name) {
        this.id = id;
        this.specialtyNumber = specialtyNumber;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSpecialityNumber() {
        return specialtyNumber;
    }

    public void setSpecialityNumber(int specialityNumber) {
        this.specialtyNumber = specialityNumber;
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

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    @Override
    public String toString() {
        return "Specialty{" +
                "id=" + id +
                ", specialtyNumber=" + specialtyNumber +
                ", name='" + name + '\'' +
                '}';
    }
}
