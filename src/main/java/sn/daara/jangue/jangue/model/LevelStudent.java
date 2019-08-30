package sn.daara.jangue.jangue.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "level_student", catalog = "school", uniqueConstraints = @UniqueConstraint(columnNames = {"level_id", "student_id"}))
public class LevelStudent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private Level level;
    private Student student;
    private Date startDate;
    private Date endDate;


    public LevelStudent() {
    }

    public LevelStudent(Level level, Student student, Date startDate, Date endDate) {
        this.level = level;
        this.student = student;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Column(name = "level_id", nullable = false, length = 8)
    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    @Column(name = "student_id", nullable = false, length = 11)
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Column(name = "start_date", nullable = false)
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Column(name = "end_date", nullable = false)
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LevelStudent that = (LevelStudent) o;
        return
                Objects.equals(level, that.level) &&
                        Objects.equals(student, that.student) &&
                        Objects.equals(startDate, that.startDate) &&
                        Objects.equals(endDate, that.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, level, student, startDate, endDate);
    }

    @Override
    public String toString() {
        return "LevelStudent{" +
                "level=" + level +
                ", student=" + student +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
