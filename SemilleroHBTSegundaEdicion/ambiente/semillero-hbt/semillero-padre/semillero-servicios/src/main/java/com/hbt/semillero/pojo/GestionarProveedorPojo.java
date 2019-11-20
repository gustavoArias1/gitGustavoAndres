/**
 * GestionarProveedorPojo.java
 */
package com.hbt.semillero.pojo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.hbt.semillero.dto.PersonaDTO;
import com.hbt.semillero.dto.ProveedorDTO;
import com.hbt.semillero.entidades.EstadoEnum;

/**
 *  Clase para gestionar localmente los proveedores para pruebas
 * 
 * @author Gustavo Andres Arias Loaiza
 * @version 
 */
public class GestionarProveedorPojo {
	
	/**
	 * atributo para el control total del numero de proveedores
	 */
	public static final Long NUMERO_PROVEEDORES = 30L;
	/*
	 * Atributo que maneja la lista global de proveedores
	 */
	private List<ProveedorDTO> listaProveedores = new ArrayList<ProveedorDTO>();
	
	/**
	 * Atributo que contiene la lista de personas 
	 */
	private List<PersonaDTO> listaPersonas = new ArrayList<PersonaDTO>();
	
	
	/**
	 * 
	 * Metodo encargado de crear un proveedorDTO
	 * 
	 * @author Gustavo Andres Arias Loaiza
	 * 
	 * @param id
	 * @param direccion
	 * @param fechaContratacion
	 * @param valorCredito
	 * @param estadoProveedor
	 * @param idPersona
	 * @return
	 */
	public ProveedorDTO crearProveedor(String id, String direccion,LocalDate fechaContratacion,BigDecimal valorCredito, EstadoEnum estadoProveedor, Integer idPersona) {
		ProveedorDTO proveedorDTO = new ProveedorDTO();
		
		for (int i = 0; i < this.listaPersonas.size(); i++) {
			if (listaPersonas.get(i).getIdPersona().equals(id)) {
				new Throwable("ya existe el proveedor"+listaPersonas.get(i).getNombrePersona());
			}else {
				proveedorDTO = new ProveedorDTO(id, direccion, fechaContratacion, valorCredito, estadoProveedor, idPersona) ;
				
			}
		}
		agregarLista(proveedorDTO);
		return proveedorDTO;
		
		
	}
	
	
	/**
	 * 
	 * Metodo encargado de agregar a la lista de proveedores general
	 * 
	 * @author Gustavo Andres Arias
	 * 
	 * @param proveedorDTO
	 */
	public void  agregarLista(ProveedorDTO proveedorDTO) {
		if (listaProveedores == null) {
			listaProveedores = new ArrayList<ProveedorDTO>();
		}
		listaProveedores.add(proveedorDTO);
		
		
	}
	
	

}

