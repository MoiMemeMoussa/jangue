package sn.daara.jangue.jangue.model;

import javax.persistence.*;
import java.time.Month;
import java.time.Year;
import java.util.Objects;

@Entity
@Table(name = "payment", catalog = "school")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Student student;
    private Level level;


    private Year year;
    private Month month;
    private int day;

    public Payment() {
    }

    public Payment(int id, Student student, Level level, Year year, Month month, int day) {
        this.id = id;
        this.student = student;
        this.level = level;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Column(name = "payment_id", nullable = false, length = 11)
    public int getId() {
        return id;
    }

    @Column(name = "student_id", nullable = false, length = 11)
    public Student getStudent() {
        return student;
    }

    @Column(name = "level_id", nullable = false, length = 8)
    public Level getLevel() {
        return level;
    }

    @Column(name = "year", nullable = false, length = 4)
    public Year getYear() {
        return year;
    }

    @Column(name = "month", nullable = false, length = 2)
    public Month getMonth() {
        return month;
    }

    @Column(name = "day", nullable = false, length = 2)
    public int getDay() {
        return day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return id == payment.id &&
                day == payment.day &&
                Objects.equals(student, payment.student) &&
                Objects.equals(level, payment.level) &&
                Objects.equals(year, payment.year) &&
                month == payment.month;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, student, level, year, month, day);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", student=" + student +
                ", level=" + level +
                ", year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
