/**
 * Persona.java
 */
package com.hbt.semillero.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase que determina la entidad que permite representar la
 * tabla "DB_SEMILLERO"."TC_PERSONA"
 * @author Gustavo Andres Arias Loaiza
 * @version 
 */

@Entity
@Table(name = "TC_PERSONA")
public class Persona {
	
	/**
	 * atributo que guarda el id de cada persona
	 */
	private Integer idPersona;
	
	/**
	 * Atributo que guarda el nombre de una persona
	 */
	private String nombrePersona;
	
	/**
	 * atributo que guarda el numero de identificacion de una persona
	 */
	private Integer numeroIdentificacion;
	
	/**
	 * Constructor de la clase.
	 */
	public Persona() {
		
	}

	/**
	 * Metodo encargado de retornar el valor del atributo idPersona
	 * @return El idPersona asociado a la clase
	 */
	
	@Id
	@Column(name = "SPID")
	public Integer getIdPersona() {
		return idPersona;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo idPersona
	 * @param idPersona El nuevo idPersona a modificar.
	 */
	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo nombrePersona
	 * @return El nombrePersona asociado a la clase
	 */
	@Column(name = "SCNOMBRE")
	public String getNombrePersona() {
		return nombrePersona;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo nombrePersona
	 * @param nombrePersona El nuevo nombrePersona a modificar.
	 */
	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo numeroIdentificacion
	 * @return El numeroIdentificacion asociado a la clase
	 */
	@Column(name = "SCNUMIDENTIFICACION")
	public Integer getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo numeroIdentificacion
	 * @param numeroIdentificacion El nuevo numeroIdentificacion a modificar.
	 */
	public void setNumeroIdentificacion(Integer numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}
	
	
	
	
}
