package api;

import java.util.List;

import domain.Election;
import domain.ElectionService;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ElectionApi {

	private final ElectionService service;

    public ElectionApi(ElectionService service) {
        this.service = service;
    }

    public void submit() {
        service.submit();
    }
    
    public List<api.dto.out.Election> list() {
        return service.findAll().stream().map(election -> api.dto.out.Election.fromDomain(election)).toList();
    }
}
