package org.bedu.java.backend.Ejemplo2.model;

import jakarta.persistence.*;

@Entity
@Table(name= "ETAPAS")
public class Etapa {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long etapaId;

	@Column(nullable = false, length = 100)
	private String nombre;

	@Column(nullable = false, unique = false)
	private Integer orden;

	public Long getEtapaId() {
		return etapaId;
	}

	public void setEtapaId(Long etapaId) {
		this.etapaId = etapaId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getOrden() {
		return orden;
	}

	public void setOrden(Integer orden) {
		this.orden = orden;
	}
}
