package inciManager.incidenceController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import inciManager.entities.Agente;
import inciManager.entities.Incidencia;
import inciManager.incidenceService.IncidenceServiceFacade;

@Controller
public class IncidenceControllerFacadeClass implements IncidenceControllerFacade {

	@Autowired
	private IncidenceServiceFacade incidenceService;
	
	@RequestMapping(value = "/addincidence", method = RequestMethod.POST)
	@Override
	public String addIncidence(@ModelAttribute Incidencia incidence) {
		//TODO Comprobar los datos del agente, De momento un mock
		if(comprobarAgente(incidence.getAgenteAux())) {
			incidenceService.processIncidence(incidence);
			
			return "exito";
		}
			
		
		return "error";
	}

	private boolean comprobarAgente(Agente agenteAux) {
		return true;
	}

	@RequestMapping("/checkincidence")
	@Override
	public String checkIncidence(@ModelAttribute Agente agente) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
