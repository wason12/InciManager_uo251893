package inciManager.incidenceController;

import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import inciManager.entities.Agente;

public class RestUtil {

	@Bean
	public RestTemplate rest() {
		return new RestTemplate();
	}

	public static boolean comprobarDatos(Agente agenteAComprobar) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.postForEntity("http://localhost:8080/user", agenteAComprobar,
				String.class);

		return response.getStatusCode().is2xxSuccessful();
	}

}
