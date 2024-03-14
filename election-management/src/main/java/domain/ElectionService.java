package domain;

import java.util.List;

import domain.annotations.Principal;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Any;
import jakarta.enterprise.inject.Instance;

@ApplicationScoped
public class ElectionService {
	
    private final CandidateService candidateService;
    private final Instance<ElectionRepository> repositories;
    private final ElectionRepository repository;
    
    
    public ElectionService(@Any Instance<ElectionRepository> repositories, CandidateService candidateService,
    						@Principal ElectionRepository repository) {
        this.repositories = repositories;
        this.candidateService = candidateService;
        this.repository = repository;
    }
    
    public List<Election> findAll() {
        return repository.findAll();
    }

    public void submit() {
        Election election = Election.create(candidateService.findAll());
        repositories.forEach(repository -> repository.submit(election));
    }

}
