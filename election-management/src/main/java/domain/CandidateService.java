package domain;

import java.util.List;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CandidateService {

	private final CandidateRepository repository;
	
	
	public CandidateService(CandidateRepository repository) {
		super();
		this.repository = repository;
	}

	public void save(Candidate candidate) {
		// TODO Auto-generated method stub
		repository.save(candidate);
		
	}

	public List<Candidate> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
		
	}

	public Candidate findById(String id) {	
		return repository.findById(id).orElseThrow();	
	}
}
