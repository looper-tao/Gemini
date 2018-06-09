package repository;

import entity.BankCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface BankCardRepository extends JpaRepository<BankCard,Long>,QueryDslPredicateExecutor<BankCard> {
}
