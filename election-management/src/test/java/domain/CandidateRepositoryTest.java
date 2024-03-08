package domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.instancio.Instancio;
import org.junit.jupiter.api.Test;

public abstract class CandidateRepositoryTest {
	
	public abstract CandidateRepository repository();

	@Test
	void save() {
		Candidate candidate = Instancio.create(Candidate.class);
		repository().save(candidate);
		
		Optional<Candidate> result = repository().findById(candidate.id());
		
		assertTrue(result.isPresent());
		assertEquals(candidate, result.get());
	}
}
