package sn.daara.jangue.jangue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.daara.jangue.jangue.model.Level;
import sn.daara.jangue.jangue.model.PaymentStudent;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentStudent, String> {
}
