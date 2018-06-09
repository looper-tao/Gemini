package repository;

import entity.TransactionRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRecordRepository extends JpaRepository<TransactionRecord,Long>,QueryDslPredicateExecutor<TransactionRecord> {
}
