/**
 * GestionarComicBin.java
 */
package com.hbt.semillero.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.entidades.Comic;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author mr-robot
 * @version 
 */
@Stateless
public class GestionarComicBin {
	@PersistenceContext
    private EntityManager em;
	
	//TODO
	/**
	 * 
	 *agregar interfaz
	 */
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void crearComic(ComicDTO comicDTO) {
		 Comic comic = new Comic();
	     comic.setId(comicDTO.getId());
	     
	     /**
	      * TODO 
	      * llenar el resto de los datos
	      */
	     em.persist(comic);
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void modificarComic(ComicDTO comicModificar) {
		Comic comic = new Comic();
	    comic.setId(comicModificar.getId());
	     
	     /**
	      * TODO 
	      * llenar el resto de los datos
	      */
		em.merge(comicModificar);
	}
	
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public ComicDTO consultarComic(String id) {
		Comic comic = em.find(Comic.class, id);
		ComicDTO comicDTO = new ComicDTO(comic.getId(), comic.getNombre());
		return comicDTO;
		
	}
	
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<ComicDTO> consultarComic() {
		em.createNativeQuery("SELECT C FROM COMIC").getResultList();
		List<Comic> resultados = (List<Comic>) em.createQuery("select c from Comic").getResultList();
		return null;
		
	}
	
}
