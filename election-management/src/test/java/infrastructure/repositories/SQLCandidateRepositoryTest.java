package infrastructure.repositories;



import domain.CandidateRepository;
import domain.CandidateRepositoryTest;
import jakarta.inject.Inject;

public class SQLCandidateRepositoryTest extends CandidateRepositoryTest{
	
	@Inject
	SQLCandidateRepository repository;

	@Override
	public CandidateRepository repository() {
		// TODO Auto-generated method stub
		return repository;
	}

	
}
