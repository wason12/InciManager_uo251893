package inciManager.entities;

import java.util.Map;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Incidencia {
	@Id
	@GeneratedValue
	private long id;
	
	private String identificadorAgente;
	private String name;
	private String descripción;	
	private String urlMasInfo;
	
	@ElementCollection
	private Set<String> etiquetas;
	@ElementCollection
	private Map<String,String> campos;
	
	@Enumerated(EnumType.STRING)
	private Estado estado;
	private Localizacion localizacion;
	@ManyToOne
	@JoinColumn(name="operator_id")
	private Operator operadorAsignado;
	
	
	
	public Incidencia() { }
	
	public Incidencia(String identificadorAgente, String name, String descripción, Set<String> etiquetas,
			Map<String, String> campos, Estado estado, Localizacion localizacion) {
		super();
		this.identificadorAgente = identificadorAgente;
		this.name = name;
		this.descripción = descripción;
		this.etiquetas = etiquetas;
		this.campos = campos;
		this.estado = estado;
		this.localizacion = localizacion;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIdentificadorAgente() {
		return identificadorAgente;
	}

	public void setIdentificadorAgente(String identificadorAgente) {
		this.identificadorAgente = identificadorAgente;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescripción() {
		return descripción;
	}

	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}

	public Set<String> getEtiquetas() {
		return etiquetas;
	}

	public void setEtiquetas(Set<String> etiquetas) {
		this.etiquetas = etiquetas;
	}

	public Map<String, String> getCampos() {
		return campos;
	}

	public void setCampos(Map<String, String> campos) {
		this.campos = campos;
	}

	public String getUrlMasInfo() {
		return urlMasInfo;
	}

	public void setUrlMasInfo(String urlMasInfo) {
		this.urlMasInfo = urlMasInfo;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Operator getOperadorAsignado() {
		return operadorAsignado;
	}

	public void setOperadorAsignado(Operator operadorAsignado) {
		this.operadorAsignado = operadorAsignado;
	}

	public Localizacion getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(Localizacion localizacion) {
		this.localizacion = localizacion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripción == null) ? 0 : descripción.hashCode());
		result = prime * result + ((identificadorAgente == null) ? 0 : identificadorAgente.hashCode());
		result = prime * result + ((localizacion == null) ? 0 : localizacion.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Incidencia other = (Incidencia) obj;
		if (descripción == null) {
			if (other.descripción != null)
				return false;
		} else if (!descripción.equals(other.descripción))
			return false;
		if (identificadorAgente == null) {
			if (other.identificadorAgente != null)
				return false;
		} else if (!identificadorAgente.equals(other.identificadorAgente))
			return false;
		if (localizacion == null) {
			if (other.localizacion != null)
				return false;
		} else if (!localizacion.equals(other.localizacion))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	
	
	

}
