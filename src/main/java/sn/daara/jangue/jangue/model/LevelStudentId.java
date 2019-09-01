package sn.daara.jangue.jangue.model;

import java.io.Serializable;
import java.util.Objects;

public class LevelStudentId implements Serializable {

    private String matricule;
    private String levelName;

    public LevelStudentId() {
    }

    public LevelStudentId(String matricule, String labelName) {
        this.matricule = matricule;
        this.levelName = labelName;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LevelStudentId that = (LevelStudentId) o;
        return Objects.equals(matricule, that.matricule) &&
                Objects.equals(levelName, that.levelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricule, levelName);
    }

    @Override
    public String toString() {
        return "LevelStudentId{" +
                "matricule='" + matricule + '\'' +
                ", levelName='" + levelName + '\'' +
                '}';
    }
}
