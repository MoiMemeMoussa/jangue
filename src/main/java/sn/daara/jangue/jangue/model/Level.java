package sn.daara.jangue.jangue.model;


import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "level", catalog = "school")
public class Level {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @ManyToMany
    private List<Student> levelStudent;

    public Level() {
    }

    public Level(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Column(name = "level_id", nullable = false, length = 8)
    public int getId() {
        return id;
    }

    @Column(name = "name", unique = true, nullable = false, length = 8)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Level level = (Level) o;
        return id == level.id &&
                name.equals(level.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Level{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
