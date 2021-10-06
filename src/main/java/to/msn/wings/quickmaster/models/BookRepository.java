package to.msn.wings.quickmaster.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends
JpaRepository<Book,Integer>{

}
