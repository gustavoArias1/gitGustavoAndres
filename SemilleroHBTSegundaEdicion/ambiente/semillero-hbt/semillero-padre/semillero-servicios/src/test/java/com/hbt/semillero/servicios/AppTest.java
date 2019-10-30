package com.hbt.semillero.servicios;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

	public void shouldAnswerWithTrue() {
		
	}
	
	@Test
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
	
	@Test
	public void probarInversionCadena() {
		String cadenaEsperada = "ovatsug";
		String resultadoReal = invertirCadena("gustavo");
		Assert.assertEquals(resultadoReal, cadenaEsperada);
	}
	
	/*
	 * Metodo que prueba si el resultado devuelto por invetir cadena no es el mismo ingresado
	 */
	
	@Test
	public void probarPalabraIgual() {
		String cadenaEsperada = "gutavo";
		String resultadoReal = invertirCadena("gustavo");
		Assert.assertNotEquals(resultadoReal, cadenaEsperada);
	}
	
	/*
	 * Metodo que prueba que la longitud de la cadena ingresada 
	 * se la misma de la cadena devuelta
	 */
	
	@Test
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
	
	@Test
	public void probarParametroVacio() {
		String cadenaEsperada = "";
		String resultadoReal = invertirCadena("");
		Assert.assertEquals(resultadoReal, cadenaEsperada);
	}
	
	/*
	 * Metodo que evalua que se inviertala candena con un palindromo
	 */
	
	@Test
	public void probarPalindromo() {
		String cadenaEsperada = "anitalavalatina";
		String resultadoReal = invertirCadena("anitalavalatina");
		Assert.assertEquals(resultadoReal, cadenaEsperada);
	}
	
	/*
	 * Metodo que evalua la inversion de la cadena aun cuando se tienen espacios
	 */

	@Test
	public void probarEspacios() {
		String cadenaEsperada = "serd na";
		String resultadoReal = invertirCadena("an dres");
		Assert.assertEquals(resultadoReal, cadenaEsperada);
	}
	
	/*
	 * Metodo que prueba que la inversion es correcta aun cuando existe 
	 * espacio a los lados
	 */
	@Test
	public void probarEspaciosLados() {
		String cadenaEsperada = "serdna   ";
		String resultadoReal = invertirCadena("   andres");
		Assert.assertEquals(resultadoReal, cadenaEsperada);
	}
	
	/*
	 * Metodo que prueba que que la inversion sirve incluso con numeros
	 */
	
	@Test
	public void probarNumeros() {
		String cadenaEsperada = "12345678";
		String resultadoReal = invertirCadena("87654321");
		Assert.assertEquals(resultadoReal, cadenaEsperada);
	}
	
	/*
	 * Metodo que prueba que la inversion sirve con numeros y letras juntos
	 */
	
	@Test
	public void probarNumerosLetras() {
		String cadenaEsperada = "1234aloh5678";
		String resultadoReal = invertirCadena("8765hola4321");
		Assert.assertEquals(resultadoReal, cadenaEsperada);
	}
	
	// TODO
	/**
	 * pendiente hacer un metodo que use el tostring de la entidad comic
         *
	 */
	
}
