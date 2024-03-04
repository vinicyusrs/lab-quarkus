package infrastructure;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import java.util.Optional;

import javax.inject.Inject;

import org.instancio.Instancio;
import org.junit.jupiter.api.Test;

import domain.Candidate;
import domain.CandidateRepository;
import domain.CandidateService;
import io.quarkus.test.InjectMock;
import io.quarkus.test.junit.QuarkusTest;



@QuarkusTest
class CandidateServiceTest {
	
	@Inject
	CandidateService service;
	
	@InjectMock
	CandidateRepository repository;
	
	@Test
	void save() {
		// isso popula os dados de candidate ou de qualquer classe -- recomendado
		Candidate candidate = Instancio.create(Candidate.class);
		
//		Candidate candidate = new Candidate("", Optional.empty(), "", "", "", Optional.empty(), Optional.empty());
//		service.save(candidate);
		
		verify(repository).save(candidate);
		verifyNoMoreInteractions(repository);
		
	}
	
	@Test
	void findAll() {
		service.findAll();
	}

}
