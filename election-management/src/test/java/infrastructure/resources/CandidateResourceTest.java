package infrastructure.resources;

import static io.restassured.RestAssured.given;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import org.instancio.Instancio;
import org.jboss.resteasy.reactive.RestResponse;
import org.junit.jupiter.api.Test;

import api.CandidateApi;
import api.dto.in.CreateCandidate;
import io.quarkus.test.InjectMock;
import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.ws.rs.core.MediaType;


@QuarkusTest
@TestHTTPEndpoint(CandidateResource.class)
class CandidateResourceTest {

	@InjectMock
	CandidateApi api;
	
	@Test
	void create() {
		var in = Instancio.create(CreateCandidate.class);
		
		// testando o codigo apenas, não o JSON
		// api.create(in);
		
		// teste o JSON e passagem de parametros atraves do http
		given().contentType(MediaType.APPLICATION_JSON).body(in)
							.when().post()
							.then().statusCode(RestResponse.StatusCode.CREATED);
		
		
		verify(api).create(in);
		verifyNoMoreInteractions(api);
		
	}

}
