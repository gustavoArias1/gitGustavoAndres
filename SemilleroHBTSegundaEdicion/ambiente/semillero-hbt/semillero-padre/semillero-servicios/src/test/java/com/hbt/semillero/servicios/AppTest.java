package com.hbt.semillero.servicios;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.entidades.Comic;
import com.hbt.semillero.entidades.EstadoEnum;
import com.hbt.semillero.entidades.TematicaEnum;
import com.hbt.semillero.pojo.GestionarComicPOJO;

public class AppTest {

	public void shouldAnswerWithTrue() {
		
	}
	
	@Test (enabled = false)
	public void pruebaSuma() {
		Long resultadoEsperado=150L;
		Long sumando1 = 100L;
		Long sumando2 = 50L;
		Long resultado = sumando1+sumando2;
		Assert.assertEquals(resultado, resultadoEsperado);
	}
	
	
	/*
	 * Metodo que invierte una cadena ingresada por parametro 
	 * @param cadena contiene la cadena a invertir
	 */
	private String invertirCadena(String cadena) {
        String cadenaInvertida = "";
        for (int x = cadena.length() - 1; x >= 0; x--) {
        	cadenaInvertida = cadenaInvertida + cadena.charAt(x);
        }
        return cadenaInvertida;
	}

	/*
	 * Metodo que prueba si la inversion de la cadena es correcta
	 */
	
	@Test (enabled = false)
	public void probarInversionCadena() {
		String cadenaEsperada = "ovatsug";
		String resultadoReal = invertirCadena("gustavo");
		Assert.assertEquals(resultadoReal, cadenaEsperada);
	}
	
	/*
	 * Metodo que prueba si el resultado devuelto por invetir cadena no es el mismo ingresado
	 */
	
	@Test (enabled = false)
	public void probarPalabraIgual() {
		String cadenaEsperada = "gutavo";
		String resultadoReal = invertirCadena("gustavo");
		Assert.assertNotEquals(resultadoReal, cadenaEsperada);
	}
	
	/*
	 * Metodo que prueba que la longitud de la cadena ingresada 
	 * se la misma de la cadena devuelta
	 */
	
	@Test (enabled = false)
	public void probarLargoPalabra() {
		String cadenaEsperada = "ovatsug";
		int tamañoEsperado = cadenaEsperada.length();
		String resultadoReal = invertirCadena("gustavo");
		int tamañoReal = resultadoReal.length();
		Assert.assertEquals(tamañoReal, tamañoEsperado);
	}
	
	/*
	 * Metodo que prueba que el retorno del metodo inversion
	 * al ingresar una cadena vacia
	 */
	
	@Test (enabled = false)
	public void probarParametroVacio() {
		String cadenaEsperada = "";
		String resultadoReal = invertirCadena("");
		Assert.assertEquals(resultadoReal, cadenaEsperada);
	}
	
	/*
	 * Metodo que evalua que se inviertala candena con un palindromo
	 */
	
	@Test (enabled = false)
	public void probarPalindromo() {
		String cadenaEsperada = "anitalavalatina";
		String resultadoReal = invertirCadena("anitalavalatina");
		Assert.assertEquals(resultadoReal, cadenaEsperada);
	}
	
	/*
	 * Metodo que evalua la inversion de la cadena aun cuando se tienen espacios
	 */

	@Test (enabled = false)
	public void probarEspacios() {
		String cadenaEsperada = "serd na";
		String resultadoReal = invertirCadena("an dres");
		Assert.assertEquals(resultadoReal, cadenaEsperada);
	}
	
	/*
	 * Metodo que prueba que la inversion es correcta aun cuando existe 
	 * espacio a los lados
	 */
	@Test (enabled = false)
	public void probarEspaciosLados() {
		String cadenaEsperada = "serdna   ";
		String resultadoReal = invertirCadena("   andres");
		Assert.assertEquals(resultadoReal, cadenaEsperada);
	}
	
	/*
	 * Metodo que prueba que que la inversion sirve incluso con numeros
	 */
	
	@Test (enabled = false)
	public void probarNumeros() {
		String cadenaEsperada = "12345678";
		String resultadoReal = invertirCadena("87654321");
		Assert.assertEquals(resultadoReal, cadenaEsperada);
	}
	
	/*
	 * Metodo que prueba que la inversion sirve con numeros y letras juntos
	 */
	
	@Test (enabled = false)
	public void probarNumerosLetras() {
		String cadenaEsperada = "1234aloh5678";
		String resultadoReal = invertirCadena("8765hola4321");
		Assert.assertEquals(resultadoReal, cadenaEsperada);
	}
	
	
	/**
	 *     EJERCICIOS SEGUNDA SESSION 
	 */
	
	/**
	 * 
	 * prueba toString clase comic
	 * @author Gustavo Andres Arias
	 *
	 */
	@Test (enabled = false)
	public void pruebaToString() {
		Comic c =  new Comic();
		Assert.assertNotNull(c.toString());
	}
	
	/**
	 * 
	 * Metodo encargado de Instanciar un enum de la clase EstadoEnum
	 * <b></b>
	 * @author Gustavo Andres Arias
	 *
	 */
	@Test (enabled = false)
	public void pruebaInstanciarEnum() {
		EstadoEnum estado = EstadoEnum.ACTIVO;
		Assert.assertEquals(estado,EstadoEnum.ACTIVO);
	}
	

	/**
	 * 
	 * Metodo encargado de devolver un string con el nombre de la constante (ACTIVO)
	 * @author Gustavo Andres Arias
	 *
	 */
	@Test (enabled = false)
	public void pruebaNombreEnum() {
		EstadoEnum estado = EstadoEnum.ACTIVO;
		String nombreEstado = estado.name();
		Assert.assertEquals(nombreEstado,EstadoEnum.ACTIVO.name());
	}
	
	/**
	 * 
	 * Metodo encargado de Devolver un entero con la posición del enum según está declarada
	 * @author Gustavo Andres Arias
	 *
	 */
	@Test (enabled = false)
	public void invertirCadenaPU9() {
		EstadoEnum estado = EstadoEnum.ACTIVO;
		int posicion = estado.ordinal();
		Assert.assertEquals(posicion,EstadoEnum.ACTIVO.ordinal());
	}
	
	/**
	 * 
	 * Comparar el enum con el parámetro según el orden en el que están declarados lo enum
	 * @author Gustavo Andres Arias
	 *
	 */
	@Test (enabled = false)
	public void pruebaCompararParametroEnum() {
		EstadoEnum estado = EstadoEnum.ACTIVO;
		Assert.assertTrue(estado.equals(EstadoEnum.ACTIVO));
		Assert.assertFalse(estado.equals(EstadoEnum.INACTIVO));
	}
	
	/**
	 * 
	 * Devolver un array que contiene todos los enum
	 * @author Gustavo Andres Arias
	 *
	 */
	@Test (enabled = false)
	public void pruebaArrayEnum() {
		EstadoEnum estado = EstadoEnum.ACTIVO;
		Assert.assertEquals(estado.values(),EstadoEnum.values());
	}
	
	@Test(enabled = false)
	public void crearComicDTOTest() {
		GestionarComicPOJO gestionarComicPOJO = new GestionarComicPOJO();
		gestionarComicPOJO.crearComicDTO();
		Assert.assertNotNull(gestionarComicPOJO.getListaComics());
		Assert.assertTrue(gestionarComicPOJO.getListaComics().size() != 0);
		Assert.assertTrue(!gestionarComicPOJO.getListaComics().isEmpty());
	}

	
	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author mr-robot
	 *
	 
	@Test (enabled = false)
	public void creartComicDTOTest() {
		GestionarComicPOJO gestionarComicPOJO = new GestionarComicPOJO();

		ComicDTO comicDTO = gestionarComicPOJO.crearComicDTO("101", "Captain America Corps 1-5 USA", "Panini Comics",
				TematicaEnum.FANTASTICO.name(), "BIBLIOTECA MARVEL", 128, new BigDecimal(5000),
				"Phillippe Briones, Roger Stern", Boolean.FALSE, LocalDate.now(), "ACTIVO", 5L);

		gestionarComicPOJO.agregarComicDTOLista(comicDTO);

		Assert.assertNotNull(gestionarComicPOJO.getListaComics());
		Assert.assertTrue(!gestionarComicPOJO.getListaComics().isEmpty());
		Assert.assertTrue(gestionarComicPOJO.getListaComics().size() == 1);

		comicDTO = new ComicDTO();

		comicDTO.setId("100");
		comicDTO.setNombre("Dragon ball Yamcha");
		comicDTO.setEditorial("Planeta Cómic");
		comicDTO.setTematica(TematicaEnum.AVENTURAS);
		comicDTO.setColeccion("Manga Shonen");
		comicDTO.setNumeroPaginas(100);
		comicDTO.setPrecio(new BigDecimal(2100));
		comicDTO.setAutores("Dragon Garow Lee");
		comicDTO.setColor(Boolean.TRUE);
		comicDTO.setFechaVenta(LocalDate.now());
		comicDTO.setEstado("ACTIVO");
		comicDTO.setCantidad(20L);

		gestionarComicPOJO.agregarComicDTOLista(comicDTO);

		Assert.assertTrue(gestionarComicPOJO.getListaComics().size() > 1);

		comicDTO = new ComicDTO();

		comicDTO.setId("100");
		comicDTO.setNombre("Dragon ball Yamcha");
		comicDTO.setEditorial("Planeta Cómic");
		comicDTO.setTematica(TematicaEnum.AVENTURAS.name());
		comicDTO.setColeccion("Manga Shonen");
		comicDTO.setNumeroPaginas(100);
		comicDTO.setPrecio(new BigDecimal(2100));
		comicDTO.setAutores("Dragon Garow Lee");
		comicDTO.setColor(Boolean.TRUE);
		comicDTO.setFechaVenta(LocalDate.now());
		comicDTO.setEstado("ACTIVO");
		comicDTO.setCantidad(20L);

		gestionarComicPOJO.agregarComicDTOLista(comicDTO);

		Assert.assertTrue(gestionarComicPOJO.getListaComics().size() == 3);
	}
	
	*/
	
}
