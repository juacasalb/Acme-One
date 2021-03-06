package acme.features.authenticated.systemConfiguration;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.components.SystemConfiguration;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AuthenticatedSystemConfgRepository extends AbstractRepository {
	
	@Query("SELECT sc FROM SystemConfiguration sc")
	SystemConfiguration findSystemConfiguration();
}
