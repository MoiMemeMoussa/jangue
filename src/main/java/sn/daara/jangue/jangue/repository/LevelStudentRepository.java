package sn.daara.jangue.jangue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.daara.jangue.jangue.model.LevelStudent;

@Repository
public interface LevelStudentRepository extends JpaRepository<LevelStudent, String> {
}
