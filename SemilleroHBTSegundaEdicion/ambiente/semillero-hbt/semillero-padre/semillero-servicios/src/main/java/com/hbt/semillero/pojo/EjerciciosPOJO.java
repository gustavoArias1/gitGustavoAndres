/**
 * EjerciciosPOJO.java
 */
package com.hbt.semillero.pojo;

import java.time.LocalDate;

import javax.ejb.Local;
import javax.swing.JOptionPane;

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
	
	
	/**
	 * 
	 * Metodo encargado de ordenar un vector
	 * <b>Caso de Uso</b>
	 * @author mr-robot
	 * 
	 * @param arreglo
	 * @return
	 */
	
	 public int [] burbuja(int arreglo[])
	    {
	        for(int i = 0; i < arreglo.length - 1; i++)
	        {
	            for(int j = 0; j < arreglo.length - 1; j++)
	            {
	                if (arreglo[j] < arreglo[j + 1])
	                {
	                    int tmp = arreglo[j+1];
	                    arreglo[j+1] = arreglo[j];
	                    arreglo[j] = tmp;
	                }
	            }
	        }
	        return arreglo;
	        
	        
}
	 
	 /**
	  * 
	  * Metodo encargado de llenar un vector
	  * <b>Caso de Uso</b>
	  * @author mr-robot
	  * 
	  * @return
	  */
	public int [] llenar() {
		int tamañoArreglo=Integer.parseInt(JOptionPane.showInputDialog("ingrese tamaño arreglo"));
		int []arreglo = new int [tamañoArreglo];
		
		for (int i = 0; i< tamañoArreglo; i++) {
			arreglo[i]= Integer.parseInt(JOptionPane.showInputDialog("ingrese numero "+i));
		}
		
		burbuja(arreglo);
		return arreglo;
	
	}
		

}
