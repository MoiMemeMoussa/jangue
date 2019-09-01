package sn.daara.jangue.jangue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sn.daara.jangue.jangue.model.Level;
import sn.daara.jangue.jangue.model.Student;

public interface StudentRepository extends CrudRepository<Student, String> {

    Student findByMatricule(String matricule);

    Student findByLevels(Level level);

    Student findByGenre(String genre);
}
