package infrastructure.repositories;



import org.junit.jupiter.api.AfterEach;

import domain.CandidateRepository;
import domain.CandidateRepositoryTest;
import io.quarkus.test.TestTransaction;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@QuarkusTest
public class SQLCandidateRepositoryTest extends CandidateRepositoryTest{
	
	@Inject
	SQLCandidateRepository repository;
	
	@Inject
	EntityManager entityManager;

	@Override
	public CandidateRepository repository() {
		// TODO Auto-generated method stub
		return repository;
	}

	// limpar o banco a cada teste
	@AfterEach
	@TestTransaction
	void tearDown() {
		entityManager.createNativeQuery("TRUNCATE TABLE candidates").executeUpdate();
	}
	
}
