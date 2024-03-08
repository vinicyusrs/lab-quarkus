package infrastructure.repositories;



import domain.CandidateRepository;
import domain.CandidateRepositoryTest;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;

@QuarkusTest
public class SQLCandidateRepositoryTest extends CandidateRepositoryTest{
	
	@Inject
	SQLCandidateRepository repository;

	@Override
	public CandidateRepository repository() {
		// TODO Auto-generated method stub
		return repository;
	}

	
}
