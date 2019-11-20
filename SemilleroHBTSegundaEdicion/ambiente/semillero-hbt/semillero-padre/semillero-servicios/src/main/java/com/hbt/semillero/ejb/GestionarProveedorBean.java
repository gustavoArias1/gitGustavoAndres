/**
 * GestionarProveedorBean.java
 */
package com.hbt.semillero.ejb;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.hbt.semillero.dto.ProveedorDTO;
import com.hbt.semillero.entidades.Proveedor;

/**
 * Clase que gestiona un proveedor en la base de datos
 * 
 * @author Gustavo Andres Arias 
 * @version 
 */
@Stateless
public class GestionarProveedorBean implements IGestionarProveedor{
	@PersistenceContext
	private EntityManager em;

	/** 
	 * @see com.hbt.semillero.ejb.IGestionarProveedor#crearProveedor(com.hbt.semillero.dto.ProveedorDTO)
	 */
	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void crearProveedor(ProveedorDTO proveedorDTO) {
		Proveedor proveedor = convertirToProveedorProveedorDTO(proveedorDTO);
		em.persist(proveedor);
			
	}

	/** 
	 * @see com.hbt.semillero.ejb.IGestionarProveedor#modificaProveedor(java.lang.Integer, java.math.BigDecimal, java.lang.String)
	 */
	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void modificaProveedor(Integer idProveedor, BigDecimal valorCredito, String nombreProveedor, ProveedorDTO proveedorDTO) {
		Proveedor proveedor;
		if (proveedorDTO == null) {
			proveedor = em.find(Proveedor.class, idProveedor);
		}else {
			proveedor = convertirToProveedorProveedorDTO(proveedorDTO); 
		}
		em.merge(proveedor);
			
	}

	/** 
	 * @see com.hbt.semillero.ejb.IGestionarProveedor#eliminarProveedor(java.lang.Integer)
	 */
	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void eliminarProveedor(Integer idProveedor) {
		Proveedor proveedor;
		proveedor = em.find(Proveedor.class, idProveedor);
		
		if (proveedor!= null) {
			em.remove(proveedor);
		}
		
	}

	/** 
	 * @see com.hbt.semillero.ejb.IGestionarProveedor#consultarProveedor(java.lang.Integer)
	 */
	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public ProveedorDTO consultarProveedor(Integer idProveedor) {
		Proveedor proveedor = em.find(Proveedor.class,idProveedor);
		ProveedorDTO proveedorDTO = convertirProveedorToProveedorDTO(proveedor);
		return proveedorDTO;
		
	}

	/** 
	 * 
	 */
	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public List<ProveedorDTO> consultarProveedores() {
		List<ProveedorDTO> resultadosProveedorDTO = new ArrayList<ProveedorDTO>();
		List<Proveedor> resultados = em.createQuery("select c from Proveedor c").getResultList();
		
		for (Proveedor proveedor : resultados) {
			resultadosProveedorDTO.add(convertirProveedorToProveedorDTO(proveedor));
		}
		return resultadosProveedorDTO;
		
	}
	
	/**
	 * 
	 * Metodo encargado de tranformar un proveedorDTO a provedor entidad
	 * 
	 * @author Gustavo Andres Arias Loaiza
	 * 
	 * @param proveedorDTO
	 * @return
	 */
	
	
	private Proveedor convertirToProveedorProveedorDTO(ProveedorDTO proveedorDTO) {
		
		Proveedor proveedor = new Proveedor();
		
		if (proveedorDTO.getId()!=null) {
			proveedor.setId(Long.parseLong(proveedorDTO.getId()));
		}
		
		proveedor.setDireccion(proveedorDTO.getDireccion());
		proveedor.setEstadoProveedor(proveedorDTO.getEstadoProveedor());
		proveedor.setFechaContratacion(proveedorDTO.getFechaContratacion());
		proveedor.setValorCredito(proveedorDTO.getValorCredito());
		return proveedor;
		
	}
	
	/**
	 * 
	 * Metodo encargado de tranformar un proveedor entidad a proveedorDTO
	 * 
	 * @author Gustavo Andres Arias Loaiza
	 * 
	 * @param proveedor
	 * @return
	 */
	
	private ProveedorDTO convertirProveedorToProveedorDTO(Proveedor proveedor) {
		
		ProveedorDTO proveedorDTO = new ProveedorDTO();
		
		if (proveedor.getId()!= null) {
			proveedorDTO.setId(proveedor.getId().toString());
		}
		
		proveedorDTO.setDireccion(proveedor.getDireccion());
		proveedorDTO.setEstadoProveedor(proveedor.getEstadoProveedor());
		proveedorDTO.setFechaContratacion(proveedor.getFechaContratacion());
		proveedorDTO.setIdPersona(proveedor.getIdPersona());
		proveedorDTO.setValorCredito(proveedor.getValorCredito());
		
		return proveedorDTO;
	}
	

}
