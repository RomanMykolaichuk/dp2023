package ua.knu.fit.mit.lection7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import ua.knu.fit.mit.lection7.entity.MyEntity;

@RepositoryRestResource(path="entity")
public interface MyRepository extends JpaRepository<MyEntity,Long> {

}
