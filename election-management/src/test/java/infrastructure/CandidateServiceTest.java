package infrastructure;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import jakarta.inject.Inject;

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
		
// candidate = new Candidate("", Optional.empty(), "", "", "", Optional.empty(), Optional.empty());
		service.save(candidate);
		
		verify(repository).save(candidate);
		verifyNoMoreInteractions(repository);
	}
	
	@Test
	void findAll() {
		List<Candidate> candidates = Instancio.stream(Candidate.class).limit(10).toList();
		
		when(repository.findAll()).thenReturn(candidates);
		List<Candidate> result = service.findAll();
		
		assertEquals(candidates, result);
		verify(repository).findAll();
		verifyNoMoreInteractions(repository);
		
		assertEquals(candidates, result);
	}
	
	@Test
	void findById() {
		// isso popula os dados de candidate ou de qualquer classe -- recomendado
		Candidate candidate = Instancio.create(Candidate.class);
		when(repository.findById(candidate.id())).thenReturn(Optional.of(candidate));
		
		//String id = Instancio.stream(Candidate.getidclass);
		Candidate result = service.findById(candidate.id());
		
		verify(repository).findById(candidate.id());
		verifyNoMoreInteractions(repository);
		
		assertEquals(candidate, result);
	}
	
	@Test
	void findById_whenCandidateIsNotFound_throwsException() {
		// isso popula os dados de candidate ou de qualquer classe -- recomendado
		Candidate candidate = Instancio.create(Candidate.class);
		when(repository.findById(candidate.id())).thenReturn(Optional.empty());
		
		assertThrows(NoSuchElementException.class, () -> service.findById(candidate.id()));
		
		verify(repository).findById(candidate.id());
		verifyNoMoreInteractions(repository);
	}

}
