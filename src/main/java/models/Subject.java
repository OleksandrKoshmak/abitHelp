package models;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "subject")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "minScore")
    private int minScore;

    @ManyToMany(fetch = FetchType.LAZY,mappedBy="subjectList")
    private List<Specialty> specialtyList = new ArrayList<>();


    public Subject() {
    }

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
