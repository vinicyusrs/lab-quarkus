package infrastructure.resources;

import api.dto.out.Election;
import jakarta.ws.rs.*;
import org.jboss.resteasy.reactive.ResponseStatus;
import org.jboss.resteasy.reactive.RestResponse;

import api.ElectionApi;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/api/elections")
public class ElectionResource {
	
	private final ElectionApi api;

    public ElectionResource(ElectionApi api) {
        this.api = api;
    }

    @POST
    @ResponseStatus(RestResponse.StatusCode.CREATED)
    @Transactional
    public void submit() {
        api.submit();
    }

    @GET
    public List<Election> findAll(){
        return api.findAll();
    }
}
