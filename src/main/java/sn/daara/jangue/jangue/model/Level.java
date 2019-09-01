package sn.daara.jangue.jangue.model;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Table(name = "level", catalog = "school", uniqueConstraints = @UniqueConstraint(columnNames = "levelName"))
@Entity
public class Level {

    @Id
    private String levelName;

    @ManyToMany(mappedBy = "levels")
    private Set<Student> students = new HashSet<>();

    public Level() {
    }

    public Level(String levelName) {
        this.levelName = levelName;
    }

    @Column(name = "level_name", unique = true, nullable = false, length = 8)
    public String getLevelName() {
        return this.levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Level level = (Level) o;
        return levelName.equals(level.levelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(levelName);
    }

    @Override
    public String toString() {
        return "Level{" +
                "levelName='" + levelName + '\'' +
                ", students=" + students +
                '}';
    }
}
