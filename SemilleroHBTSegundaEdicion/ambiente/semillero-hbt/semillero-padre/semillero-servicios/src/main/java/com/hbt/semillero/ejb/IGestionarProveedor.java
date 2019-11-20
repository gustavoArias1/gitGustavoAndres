/**
 * IGestionarProveedor.java
 */
package com.hbt.semillero.ejb;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

import javax.ejb.Local;

import com.hbt.semillero.dto.ProveedorDTO;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author mr-robot
 * @version 
 */

@Local
public interface IGestionarProveedor {
	
	/**
	 * 
	 * Metodo encargado de crear un proveedor y almacenarlo
	 * 
	 * @author Gustavo Andres Arias Loaiza
	 * 
	 * @param proveedorDTO objeto proveedor que sera creado
	 */
	
	
	public void crearProveedor(ProveedorDTO proveedorDTO);
	
	/**
	 * 
	 * Metodo encargado de  cosunlta un proveedor, modificarlo y por ultimo guardarlo
	 *
	 * @author Gustavo Andres Arias
	 * 
	 * @param idProveedor
	 * @param valorCredito
	 * @param nombreProveedor
	 */
	public void modificaProveedor(Integer idProveedor,BigDecimal valorCredito,String nombreProveedor, ProveedorDTO proveedorDTO);
	
	/**
	 * 
	 * Metodo encargado de  eliminar un proveedor
	 * 
	 * @author Gustavo Andres Arias Loaiza
	 * 
	 * @param idProveedor
	 */
	public void eliminarProveedor(Integer idProveedor);
	
	/**
	 * 
	 * Metodo encargado de consultar un proveedor
	 * 
	 * @author Gustavo Andres Arias Loaiza
	 * 
	 * @param idProveedor 
	 */
	public ProveedorDTO consultarProveedor(Integer idProveedor);
	
	/**
	 * 
	 * Metodo encargado de consultar todos los proveedores 
	 * 
	 * @author Gustavo Andres Arias Loaiza
	 *
	 */
	public List<ProveedorDTO> consultarProveedores();
	
	
}
