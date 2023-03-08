package ua.knu.fit.mit.lection7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.knu.fit.mit.lection7.entity.MyEntity;

@Repository
public interface MyRepository extends JpaRepository<MyEntity,Long> {

}
