package one.digitalinnovation.gof.repository;

import com.example.labpadroesprojetospring.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
}