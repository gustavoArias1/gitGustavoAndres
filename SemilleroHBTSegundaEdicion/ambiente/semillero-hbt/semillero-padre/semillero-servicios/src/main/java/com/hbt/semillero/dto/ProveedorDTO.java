/**
 * ProveedorDTO.java
 */
package com.hbt.semillero.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.hbt.semillero.entidades.EstadoEnum;

/**
 *  Clase para la creacion de un proveedorDTO
 *
 * @author Gustavo Andres Arias Loaiza
 * @version 
 */
public class ProveedorDTO {
	

	/**
	 * Atributo que determina cual es el identificador del proveedor
	 */
	private String id;
	
	
	
	/**
	 * Atributo que determina la direccion de residencia de un proveedor
	 */
	private String direccion;
	
	/**
	 * Atributo que determina la fecha en la cual se inicio la contratacion con el proveedor
	 */
	private LocalDate fechaContratacion;
	
	/**
	 * Atributo que determina el valor del credito prestado a la tienda
	 */
	private BigDecimal valorCredito;
	
	/**
	 * Atributo que determina el nombre de un proveedor
	 */
	private EstadoEnum estadoProveedor;
	
	
	/**
	 * Atributo que determina el id de una persona 
	 */
	private Integer idPersona;
	
	

	/**
	 * Constructor de la clase.
	 */
	public ProveedorDTO() {
		super();
	}
	
	
	
	/**
	 * Constructor de la clase.
	 * @param id
	 * @param direccion
	 * @param fechaContratacion
	 * @param valorCredito
	 * @param estadoProveedor
	 * @param idPersona
	 */
	public ProveedorDTO(String id, String direccion, LocalDate fechaContratacion, BigDecimal valorCredito,
			EstadoEnum estadoProveedor, Integer idPersona) {
		super();
		this.id = id;
		this.direccion = direccion;
		this.fechaContratacion = fechaContratacion;
		this.valorCredito = valorCredito;
		this.estadoProveedor = estadoProveedor;
		this.idPersona = idPersona;
	}



	/**
	 * Metodo encargado de retornar el valor del atributo id
	 * @return El id asociado a la clase
	 */
	public String getId() {
		return id;
	}


	/**
	 * Metodo encargado de modificar el valor del atributo id
	 * @param id El nuevo id a modificar.
	 */
	public void setId(String id) {
		this.id = id;
	}

	
	/**
	 * Metodo encargado de retornar el valor del atributo direccion
	 * @return El direccion asociado a la clase
	 */
	public String getDireccion() {
		return direccion;
	}


	/**
	 * Metodo encargado de modificar el valor del atributo direccion
	 * @param direccion El nuevo direccion a modificar.
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	/**
	 * Metodo encargado de retornar el valor del atributo fechaContratacion
	 * @return El fechaContratacion asociado a la clase
	 */
	public LocalDate getFechaContratacion() {
		return fechaContratacion;
	}


	/**
	 * Metodo encargado de modificar el valor del atributo fechaContratacion
	 * @param fechaContratacion El nuevo fechaContratacion a modificar.
	 */
	public void setFechaContratacion(LocalDate fechaContratacion) {
		this.fechaContratacion = fechaContratacion;
	}


	/**
	 * Metodo encargado de retornar el valor del atributo valorCredito
	 * @return El valorCredito asociado a la clase
	 */
	public BigDecimal getValorCredito() {
		return valorCredito;
	}


	/**
	 * Metodo encargado de modificar el valor del atributo valorCredito
	 * @param valorCredito El nuevo valorCredito a modificar.
	 */
	public void setValorCredito(BigDecimal valorCredito) {
		this.valorCredito = valorCredito;
	}


	/**
	 * Metodo encargado de retornar el valor del atributo estadoProveedor
	 * @return El estadoProveedor asociado a la clase
	 */
	public EstadoEnum getEstadoProveedor() {
		return estadoProveedor;
	}


	/**
	 * Metodo encargado de modificar el valor del atributo estadoProveedor
	 * @param estadoProveedor El nuevo estadoProveedor a modificar.
	 */
	public void setEstadoProveedor(EstadoEnum estadoProveedor) {
		this.estadoProveedor = estadoProveedor;
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

	


	
	
}
