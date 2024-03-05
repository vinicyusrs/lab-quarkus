package infrastructure.repositories;

import java.util.List;
import java.util.Optional;

import domain.Candidate;
import domain.CandidateRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SQLCandidateRepository implements CandidateRepository {

	@Override
	public void save(List<Candidate> candidates) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Candidate> findAll() {
		// TODO Auto-generated method stub
		return List.of();
	}

	@Override
	public Optional<Candidate> findById(String id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
