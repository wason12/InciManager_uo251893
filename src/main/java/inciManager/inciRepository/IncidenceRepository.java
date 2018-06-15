package inciManager.inciRepository;

import org.springframework.data.repository.CrudRepository;

import inciManager.entities.Incidencia;
import java.lang.String;
import java.util.List;

interface IncidenceRepository  extends CrudRepository<Incidencia, Long> {
	
	List<Incidencia> findByIdentificadorAgente(String identificadoragente);

}
