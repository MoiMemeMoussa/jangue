package sn.daara.jangue.jangue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.daara.jangue.jangue.model.Level;

@Repository
public interface LevelRepository extends JpaRepository<Level, String> {
}
