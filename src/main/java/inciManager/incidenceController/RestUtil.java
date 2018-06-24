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
		ResponseEntity<String> response = restTemplate.postForEntity("http://ec2-54-186-46-133.us-west-2.compute.amazonaws.com/user", agenteAComprobar,
				String.class);

		return response.getStatusCode().is2xxSuccessful();
	}

}
