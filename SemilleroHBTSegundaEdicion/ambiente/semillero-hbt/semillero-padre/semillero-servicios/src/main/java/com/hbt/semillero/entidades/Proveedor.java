/**
 * Proveedor.java
 */
package com.hbt.semillero.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase que determina la entidad que permite representar la
 * tabla "DB_SEMILLERO"."TC_PROVEEDOR"
 * @author Gustavo Andres Arias Loaiza
 * @version 
 */
@Entity
@Table(name = "TC_PROVEEDOR")
public class Proveedor implements Serializable{
	
	
	
	/**
	 * Atributo que determina la version de la serializacion
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String direccion;
	private LocalDate fechaContratacion;
	private BigDecimal valorCredito;
	private EstadoEnum estadoProveedor;
	private Integer idPersona;
	
	
	
	/**
	 * Constructor de la clase.
	 */
	public Proveedor() {
		
	}

	/**
	 * Metodo encargado de retornar el valor del atributo id
	 * @return El id asociado a la clase
	 */
	@Id
	@Column(name = "SPID")
	public Long getId() {
		return id;
	}



	/**
	 * Metodo encargado de modificar el valor del atributo id
	 * @param id El nuevo id a modificar.
	 */
	public void setId(Long id) {
		this.id = id;
	}



	/**
	 * Metodo encargado de retornar el valor del atributo direccion
	 * @return El direccion asociado a la clase
	 */
	@Column(name = "SPDIRECCION")
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
	@Column(name = "SPFECHA_CREACION")
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
	@Column(name = "SPMONTO_CREDITO")
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
	@Column(name = "SPESTADO")
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
	@Column(name = "SPIDPERSONA")
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
