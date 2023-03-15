package ua.knu.fit.mit.lection8.all;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "things", path = "things")
public interface MyRepository extends JpaRepository<MyEntity,Long> {

}
