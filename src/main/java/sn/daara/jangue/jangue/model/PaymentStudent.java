package sn.daara.jangue.jangue.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

@Entity
@IdClass(PaymentStudentId.class)
@Table(name = "payment", catalog = "school", uniqueConstraints = @UniqueConstraint(columnNames = {"levelName", "mois", "matricule"}))
public class PaymentStudent implements Serializable {

    @Id
    private String levelName;

    @Id
    private int mois;

    @Id
    private String matricule;

    private Date datePayment;


    public PaymentStudent(String levelName, String matricule, int mois, Date datePayment) {
        this.levelName = levelName;
        this.matricule = matricule;
        this.mois = mois;
        this.datePayment = datePayment;
    }

    @Column(name = "level_name", unique = true, nullable = false, length = 8)
    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    @Column(name = "matricule", unique = true, nullable = false, length = 11)
    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    @Column(name = "mois", unique = true, nullable = false, length = 8)
    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    @Column(name = "date_payment", unique = true, nullable = false, length = 8)
    public Date getDatePayment() {
        return datePayment;
    }

    public void setDatePayment(Date datePayment) {
        this.datePayment = datePayment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentStudent that = (PaymentStudent) o;
        return mois == that.mois &&
                Objects.equals(levelName, that.levelName) &&
                Objects.equals(matricule, that.matricule) &&
                Objects.equals(datePayment, that.datePayment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(levelName, matricule, mois, datePayment);
    }

    @Override
    public String toString() {
        return "PaymentStudent{" +
                "levelName='" + levelName + '\'' +
                ", matricule='" + matricule + '\'' +
                ", mois=" + mois +
                ", datePayment=" + datePayment +
                '}';
    }
}
