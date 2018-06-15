package inciManager.inciRepository;

import java.util.List;

import inciManager.entities.Incidencia;
import inciManager.entities.Operator;

public interface InciRepositoryFacade{

	public void saveIncidence(Incidencia incidencia);
	public List<Operator> getOperators();
	List<Incidencia> getIncidence(String identificador);
	
}
