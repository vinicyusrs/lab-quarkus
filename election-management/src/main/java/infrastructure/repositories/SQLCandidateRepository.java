package infrastructure.repositories;

import java.util.List;

import domain.Candidate;
import domain.CandidateQuery;
import domain.CandidateRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class SQLCandidateRepository implements CandidateRepository {

	private final EntityManager entityManager;
	
	
	public SQLCandidateRepository(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public void save(List<Candidate> candidates) {
		// TODO Auto-generated method stub
		candidates.stream()
				.map(candidate -> infrastructure.repositories.entities.Candidate.fromDomain(candidate))
						.forEach(entity ->{
							entityManager.merge(entity);
						});		
	}

	@Override
	public List<Candidate> find(CandidateQuery query) {
		// TODO Auto-generated method stub
		return List.of();
	}

	//substituido pelo find do query
//	@Override
//	public List<Candidate> findAll() {
//		// TODO Auto-generated method stub
//		return List.of();
//	}
//
//	@Override
//	public Optional<Candidate> findById(String id) {
//		// TODO Auto-generated method stub
//		return Optional.empty();
//	}
}
