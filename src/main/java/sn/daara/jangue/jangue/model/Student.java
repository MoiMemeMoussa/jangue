package sn.daara.jangue.jangue.model;


import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "student", catalog = "school")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String key;
    private String firstName;
    private String lastName;
    private String parent;
    private int contact;
    private Date birthDate;

    //@ManyToMany(mappedBy = "levelStudent",fetch = FetchType.LAZY)
    @ManyToMany(mappedBy = "levelStudent")
    private Level level;

    public Student() {
    }

    public Student(Level level, int id, String registrationNumber, String firstName, String lastName, String parent, int contact, Date birthDate) {
        this.level = level;
        this.id = id;
        this.key = registrationNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.parent = parent;
        this.contact = contact;
        this.birthDate = birthDate;
    }

    @Column(name = "student_id", nullable = false, length = 11)
    public int getId() {
        return id;
    }

    @Column(unique = true, name = "key", nullable = false, length = 20)
    public String getKey() {
        return key;
    }

    @Column(name = "firstName", nullable = false, length = 25)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "lastName", nullable = false, length = 25)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "parent", nullable = false, length = 50)
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

    @Column(name = "birthDate", nullable = false, length = 8)
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                contact == student.contact &&
                Objects.equals(key, student.key) &&
                Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName) &&
                Objects.equals(parent, student.parent) &&
                Objects.equals(birthDate, student.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, key, firstName, lastName, parent, contact, birthDate);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", key='" + key + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", parent='" + parent + '\'' +
                ", contact=" + contact +
                ", birthDate=" + birthDate +
                '}';
    }
}
