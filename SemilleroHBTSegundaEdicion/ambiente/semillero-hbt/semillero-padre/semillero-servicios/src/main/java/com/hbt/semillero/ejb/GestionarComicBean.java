/**
 * GestionarComicBean.java
 */
package com.hbt.semillero.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.entidades.Comic;

/**
 * < Clase que gestiona un comic en la base de datos 
 * <b>Caso de Uso:<b> 
 * @author Gustavo Andres Arias
 * @version 
 */
@Stateless
public class GestionarComicBean  implements IGestionarComicLocal{
	@PersistenceContext
    private EntityManager em;
	
	
	
	/**
	 * metodo encargdo de agregar un comic a la base de datos
	 * @see com.hbt.semillero.ejb.IGestionarComicLocal#crearComic(com.hbt.semillero.dto.ComicDTO)
	 */
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void crearComic(ComicDTO comicDTO) {
		 Comic comic = convertirComicDTOToComic(comicDTO);
	     em.persist(comic);
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void modificarComic(ComicDTO comicModificar) {
		Comic comic = new Comic();
	    //comic.setId(comicModificar.getId());
	     
	     /**
	      * TODO 
	      * llenar el resto de los datos
	      */
		em.merge(comicModificar);
	}
	
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public ComicDTO consultarComic(String id) {
		Comic comic = em.find(Comic.class, id);
		ComicDTO comicDTO = convertirComicToComicDTO(comic);
		return comicDTO;
		
	}
	
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<ComicDTO> consultarComic() {
		em.createNativeQuery("SELECT C FROM COMIC").getResultList();
		List<Comic> resultados = (List<Comic>) em.createQuery("select c from Comic").getResultList();
		return null;
		
	}

	/** 
	 * metodo encargado de modificar los datos de un comic en la base de datos
	 * @see com.hbt.semillero.ejb.IGestionarComicLocal#modificarComic(java.lang.Long, java.lang.String, com.hbt.semillero.dto.ComicDTO)
	 */
	@Override
	//@TransactionAttribute(TransactionAttributeType.REQUIRED)
	//  TODO cual es el resultado de llamar este metodo si la transaccion
	public void modificarComic(Long id, String nombre, ComicDTO comicNuevo) {
		Comic comicModificar;
		if (comicNuevo==null) {
			comicModificar = em.find(Comic.class, id);
		}else {
			comicModificar = convertirComicDTOToComic(comicNuevo);
		}
		//TODO validar si comicmodificar llego con datos 
		comicModificar.setNombre(nombre);
		em.merge(comicModificar);
	}

	/** 
	 * metodo encargado de eliminar un comic de la base de datos
	 * @see com.hbt.semillero.ejb.IGestionarComicLocal#eliminarComic(java.lang.Long)
	 */
	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void eliminarComic(Long idComic) {
		Comic comicEliminar;
		comicEliminar = em.find(Comic.class, idComic);
		
		if (comicEliminar!=null) {
			em.remove(comicEliminar);
		}
		
	}

	/** 
	 * metodo encargado de consultar la lista de comics guardados
	 * @see com.hbt.semillero.ejb.IGestionarComicLocal#consultarComics()
	 */
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<ComicDTO> consultarComics() {
		List<ComicDTO> resultadosComicDTO = new ArrayList<ComicDTO>();
		List<Comic> resultados = em.createQuery("select c from Comic c").getResultList();
		
		for (Comic comic : resultados) {
			resultadosComicDTO.add(convertirComicToComicDTO(comic));
		}
		return resultadosComicDTO;
	}
	
	/**
	 * 
	 * Metodo encargado de convertir un comicDTO a comic
	 * @author Gustavo Andres Arias
	 * 
	 * @param comic
	 * @return
	 */
	
	private Comic convertirComicDTOToComic(ComicDTO comicDTO) {
		Comic comic = new Comic();
        if(comicDTO.getId()!=null) {
            comic.setId(Long.parseLong(comicDTO.getId()));
        }
        comic.setNombre(comicDTO.getNombre());
        comic.setEditorial(comicDTO.getEditorial());
        comic.setTematicaEnum(comicDTO.getTematicaEnum());
        comic.setColeccion(comicDTO.getColeccion());
        comic.setNumeroPaginas(comicDTO.getNumeroPaginas());
        comic.setPrecio(comicDTO.getPrecio());
        comic.setAutores(comicDTO.getAutores());
        comic.setColor(comicDTO.getColor());
        comic.setFechaVenta(comicDTO.getFechaVenta());
        comic.setEstadoEnum(comicDTO.getEstadoEnum());
        comic.setCantidad(comicDTO.getCantidad());
        return comic;
	}
	
	
	/**
	 * 
	 * Metodo encargado de convertir un comic a comicDTO
	 * @author Gustavo Andres Arias
	 * 
	 * @param comic
	 * @return
	 */
	private ComicDTO convertirComicToComicDTO(Comic comic) {
        ComicDTO comicDTO = new ComicDTO();
        if(comic.getId()!=null) {
         comicDTO.setId(comic.getId().toString());
        }
        comicDTO.setNombre(comic.getNombre());
        comicDTO.setEditorial(comic.getEditorial());
        comicDTO.setTematicaEnum(comic.getTematicaEnum());
        comicDTO.setColeccion(comic.getColeccion());
        comicDTO.setNumeroPaginas(comic.getNumeroPaginas());
        comicDTO.setPrecio(comic.getPrecio());
        comicDTO.setAutores(comic.getAutores());
        comicDTO.setColor(comic.getColor());
        comicDTO.setFechaVenta(comic.getFechaVenta());
        comicDTO.setEstadoEnum(comic.getEstadoEnum());
        comicDTO.setCantidad(comic.getCantidad());
        return comicDTO;
    }
	
	
}
