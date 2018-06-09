package repository;

import entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo,Long>,QueryDslPredicateExecutor<UserInfo> {
}
