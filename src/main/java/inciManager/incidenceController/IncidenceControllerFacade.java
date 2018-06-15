package inciManager.incidenceController;

import inciManager.entities.Agente;
import inciManager.entities.Incidencia;

public interface IncidenceControllerFacade {
	
	public String addIncidence(Incidencia incidence);
	public String checkIncidence(Agente agente);

}
