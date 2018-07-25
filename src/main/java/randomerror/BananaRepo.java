package randomerror;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "banana")
public interface BananaRepo extends JpaRepository<Banana,Long> {

}
