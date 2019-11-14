/**
 * EjeciciosTest.java
 */
package com.hbt.semillero.servicios;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author Gustavo Andres Arias
 * @version 
 */
public class EjeciciosTest {
	
	@Test 
	public void ejercicio1() {
		int A$B = 1;
		Assert.assertEquals(1, A$B);
		
		int _helloWord=1;
		Assert.assertEquals(1, _helloWord);
		
		int true=1;
		Assert.assertEquals(1, true);
		
		int java.lang=1;
		Assert.assertEquals(1, javalang);
		
		int public =1;
		Assert.assertEquals(1, public);
		
		int 1980_s=1;
		Assert.assertEquals(1, 1980_2);
		
		
		
	}
	
	
	public static void ejercicioIni() {

		 
		final String brand;

		final boolean empty;
		
		System.out.print("Empty = " + empty);

		System.out.print(", Brand = " + brand);

		}
	
	public static void ejercicio2() {
	

		 
			
	}
	
	
	
	/**
	 * 
	 * Metodo encargado de sacar los numero primos
	 * <b>Caso de Uso</b>
	 * @author gustavo andres arias
	 * 
	 * @param numero es el numero a verificar
	 * @return
	 */
	public boolean esPrimo(int numero  ) {
		
		int contador=0;
		for (int i = 0; i <numero; i++) {
			if (numero%i==0) {
				contador++;
			}
			
		}
		
		if (contador >2) {
			return false;
		}else {
			return true;
		}
		
		
		
	}
	
	/**
	 * 
	 * Metodo encargado de probar que el metodo saque los numero primos
	 * <b>Caso de Uso</b>
	 * @author Gustavo andres arias
	 *
	 */
	
	@Test 
	public void ejercicio3() {
		
		boolean numeroUno = true; // 5
		boolean numeroDos = false; // 222
		boolean numeroTres= false; // 0
		
		Assert.assertEquals(numeroUno, esPrimo(5));
		Assert.assertEquals(numeroDos, esPrimo(222));
		Assert.assertEquals(numeroTres, esPrimo(0));
		
		
	}
	
	
	

}
