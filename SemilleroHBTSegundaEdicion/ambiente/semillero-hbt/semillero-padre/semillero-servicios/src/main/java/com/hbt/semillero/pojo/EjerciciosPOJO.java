/**
 * EjerciciosPOJO.java
 */
package com.hbt.semillero.pojo;

import java.time.LocalDate;

import javax.ejb.Local;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author mr-robot
 * @version 
 */
public class EjerciciosPOJO {
	
	/**
	 * 
	 * Metodo encargado de evaluar que al sumar edades sea hoy 
	 * <b>Caso de Uso</b>
	 * @author mr-robot
	 * 
	 * @param numero
	 * @return
	 */
	
	
	public boolean fecha(int numero) {
		LocalDate  fechaNacimiento= LocalDate.of(1994,11,13);
		
		LocalDate fechahoy = LocalDate.now();
		
		
		if (fechaNacimiento.plusYears(numero).equals(fechahoy)) {
			return true;
			
		}else {
			return false;
		}
		
	}

}
