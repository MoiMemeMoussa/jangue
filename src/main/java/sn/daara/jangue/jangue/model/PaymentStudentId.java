package sn.daara.jangue.jangue.model;

import java.io.Serializable;
import java.util.Objects;

public class PaymentStudentId implements Serializable {

    private String matricule;
    private String levelName;
    private int mois;

    public PaymentStudentId() {
    }

    public PaymentStudentId(String matricule, String levelName, int mois) {
        this.matricule = matricule;
        this.levelName = levelName;
        this.mois = mois;
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

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentStudentId paymentStudentId = (PaymentStudentId) o;
        return mois == paymentStudentId.mois &&
                Objects.equals(matricule, paymentStudentId.matricule) &&
                Objects.equals(levelName, paymentStudentId.levelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricule, levelName, mois);
    }

    @Override
    public String toString() {
        return "PaymentStudentId{" +
                "matricule='" + matricule + '\'' +
                ", levelName='" + levelName + '\'' +
                ", mois=" + mois +
                '}';
    }
}
