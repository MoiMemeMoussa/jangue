package sn.daara.jangue.jangue.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "level_student", catalog = "school", uniqueConstraints = @UniqueConstraint(columnNames = {"levelName", "matricule"}))
public class LevelStudent implements Serializable {

    @Id
    private String levelName;

    @Id
    private String matricule;

    private Date startDate;
    private Date endDate;


    public LevelStudent() {
    }

    public LevelStudent(String levelName, String matricule, Date startDate, Date endDate) {
        this.levelName = levelName;
        this.matricule = matricule;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Column(name = "level_name", nullable = false, length = 8, unique = true)
    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String level_name) {
        this.levelName = level_name;
    }

    @Column(name = "matricule", nullable = false, length = 11, unique = true)
    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "start_date", nullable = false)
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Temporal(TemporalType.DATE)
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
                Objects.equals(levelName, that.levelName) &&
                        Objects.equals(matricule, that.matricule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(levelName, matricule, startDate, endDate);
    }

    @Override
    public String toString() {
        return "LevelStudent{" +
                "levelName=" + levelName +
                ", matricule=" + matricule +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
