package sn.daara.jangue.jangue.model;


import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.*;

@Table(name = "student", catalog = "school", uniqueConstraints = @UniqueConstraint(columnNames = "matricule"))
@Entity
public class Student {


    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "level_student",
            joinColumns = @JoinColumn(name = "levelName"),
            inverseJoinColumns = @JoinColumn(name = "matricule")
    )
    private Set<Level> levels = new HashSet<>();

    private String firstName;
    private String lastName;
    private String parent;
    private int contact;
    private Date birthDate;
    @Id
    private String matricule;


    public Student() {
    }

    public Student(String matricule, String firstName, String lastName, String parent, int contact, Date birthDate) {
        this.matricule = matricule;
        this.firstName = firstName;
        this.lastName = lastName;
        this.parent = parent;
        this.contact = contact;
        this.birthDate = birthDate;
    }

    @Column(name = "matricule", unique = true, nullable = false, length = 10)
    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    @Column(name = "first_name", nullable = false, length = 30)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name", nullable = false, length = 20)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "parent", nullable = false, length = 40)
    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    @Column(name = "contact", nullable = false, length = 9)
    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "birth_date", length = 8)
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Set<Level> getLevels() {
        return levels;
    }

    public void setLevels(Set<Level> levels) {
        this.levels = levels;
    }

    public void addLevel(Level level) {
        levels.add(level);
        level.getStudents().add(this);
    }

    public void remove(Level level) {
        levels.remove(level);
        level.getStudents().remove(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return
                Objects.equals(matricule, student.matricule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricule, firstName, lastName, parent, contact, birthDate);
    }

    @Override
    public String toString() {
        return "Student{" +
                "matricule='" + matricule + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", parent='" + parent + '\'' +
                ", contact=" + contact +
                ", birthDate=" + birthDate +
                '}';
    }
}
