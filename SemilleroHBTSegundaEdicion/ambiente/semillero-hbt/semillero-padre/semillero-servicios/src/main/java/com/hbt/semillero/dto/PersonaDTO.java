/**
 * PersonaDTO.java
 */
package com.hbt.semillero.dto;

/**
 *  Clase que crea una personaDTO
 * 
 * @author Gustavo Andres Arias 
 * @version 
 */
public class PersonaDTO {
	
	
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
	public PersonaDTO() {
		
	}
	
	
	/**
	 * Constructor de la clase.
	 * @param idPersona
	 * @param nombrePersona
	 * @param numeroIdentificacion
	 */
	public PersonaDTO(Integer idPersona, String nombrePersona, Integer numeroIdentificacion) {
		super();
		this.idPersona = idPersona;
		this.nombrePersona = nombrePersona;
		this.numeroIdentificacion = numeroIdentificacion;
	}


	/**
	 * Metodo encargado de retornar el valor del atributo idPersona
	 * @return El idPersona asociado a la clase
	 */
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
