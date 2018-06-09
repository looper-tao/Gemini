package repository;

import entity.EmergencyContactPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface EmergencyContactPersonRepository extends JpaRepository<EmergencyContactPerson,Long>,QueryDslPredicateExecutor<EmergencyContactPerson> {
}
