package domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.instancio.Select.field;
import java.util.Optional;
import java.util.List;
import org.instancio.Instancio;
import org.junit.jupiter.api.Test;

public abstract class CandidateRepositoryTest {
	
	public abstract CandidateRepository repository();

	@Test
	void save() {
		// isso popula os dados de candidate ou de qualquer classe -- recomendado
		Candidate candidate = Instancio.create(Candidate.class);
		repository().save(candidate);
		
		Optional<Candidate> result = repository().findById(candidate.id());
		
		assertTrue(result.isPresent());
		assertEquals(candidate, result.get());
	}
	
	@Test
    void findAll() {
        var candidates = Instancio.stream(Candidate.class).limit(10).toList();
        repository().save(candidates);
        List<Candidate> result = repository().findAll();
        
        assertEquals(candidates, result); // esse teste deu erro na formatação
        assertEquals(candidates.size(), result.size());
    }

    @Test
    void findByName() {
        var candidate1 = Instancio.create(Candidate.class);
        var candidate2 = Instancio.of(Candidate.class).set(field("familyName"), "Poiani").create();
        var query = new CandidateQuery.Builder().name("POI").build();

        repository().save(List.of(candidate1, candidate2));
        List<Candidate> result = repository().find(query);
        
        assertEquals(1, result.size());
        assertEquals(candidate2, result.get(0));
    }
}
