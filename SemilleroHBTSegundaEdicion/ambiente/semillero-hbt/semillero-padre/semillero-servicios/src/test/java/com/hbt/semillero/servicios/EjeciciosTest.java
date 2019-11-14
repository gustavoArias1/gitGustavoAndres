/**
 * EjeciciosTest.java
 */
package com.hbt.semillero.servicios;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hbt.semillero.pojo.EjerciciosPOJO;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author Gustavo Andres Arias
 * @version 
 */
public class EjeciciosTest {
		
	
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
	
	/**
	 * 
	 * Metodo encargado de evaluar la suma de las edades 
	 * <b>Caso de Uso</b>
	 * @author mr-robot
	 *
	 */
	
	@Test 
	public void ejercicio4() {
		
		boolean esIgual=true;
		EjerciciosPOJO ej = new EjerciciosPOJO();
		
		Assert.assertEquals(esIgual, ej.fecha(25));
		
		
		
	}
	
	
	/**
	 * 
	 * Metodo encargado de  coprobar si un vector esta lleno y ordenado
	 * <b>Caso de Uso</b>
	 * @author mr-robot
	 *
	 */
	
	@Test 
	public void ejercicio5() {
		
	 int primeraPosicion=-2;
	 int ultimaPosicion = 249;
	 EjerciciosPOJO ej = new EjerciciosPOJO();
	 int [] arreglo = ej.llenar();
	 
	 Assert.assertEquals(primeraPosicion,arreglo[0] );	
	 Assert.assertEquals(ultimaPosicion,arreglo[arreglo.length-1] );	
		
		
	}
	
	
	/**
	 * 
	 * Metodo encargado de probar el metodo de ganar en tennis
	 * <b>Caso de Uso</b>
	 * @author Gustavo  andres arias
	 *
	 */
	
	public void ejercicio7() {
		
		 EjerciciosPOJO ejerciciosPojo = new EjerciciosPOJO();
		 int [] jugador1= {6,3,6};
		 int [] jugador2= {4,6,1};
		
		 Assert.assertEquals("jugador1", ejerciciosPojo.Ganador(jugador1, jugador2));
		
	}
	
	
	
	

}
