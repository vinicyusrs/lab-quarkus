package api;

import java.util.List;

import api.dto.in.CreateCandidate;
import api.dto.in.UpdateCandidate;
import domain.Candidate;
import domain.CandidateService;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CandidateApi {
	
	private final CandidateService service;
	
	public CandidateApi(CandidateService service) {
		this.service = service;
	}

	public void create(CreateCandidate dto) {
		// TODO Auto-generated method stub
		service.save(dto.toDomain());
	}

	public api.dto.out.Candidate update(String id, UpdateCandidate dto) {
		// TODO Auto-generated method stub
		service.save(dto.toDomain(id));
		Candidate candidate = service.findById(id);
		
		return api.dto.out.Candidate.fromDomain(candidate);
	}
	
	public List<api.dto.out.Candidate> list() {
		return service.findAll().stream().map(candidate -> api.dto.out.Candidate.fromDomain(candidate)).toList();
	}
	
}
