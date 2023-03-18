/**
 * 
 */
package ejercicio05;

import java.util.Random;

/**
 * @author paul_
 *
 */
public class Password {
		
	private final int LONGITUD_DEF = 8; // Definimos la longitud por defecto en 8
	//Definimos los valores que generará la contraseña
	private static final String[] CARACTERES = new String[] { "abcdefghijklmnopqrstuvwxyz",
			"ABCDEFGHIJKLMNOPQRSTUVWXYZ", "0123456789" };
	
	private int longitud;
	private String contraseña;
	
	/**
	 * 
	 */
	public Password() {
		this.longitud = LONGITUD_DEF;
	}
	
	/**
	 * @param longitud
	 * @param contraseña
	 */
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = generarPassword(longitud);
	}
	
	public String generarPassword(int longitud) {
		String contraseña = "";
		Random random = new Random();
		// Recorremos el array con la longitud indicada y generamos un string con los valores aleatorios indicados previamente
		for (int i = 0; i < longitud; i++) {
			String caracteres = CARACTERES[random.nextInt(CARACTERES.length)];
			int posicion = random.nextInt(caracteres.length());
			contraseña = contraseña + (caracteres.charAt(posicion));
		}
		return contraseña;
	}
	
	public boolean esFuerte() {
		int mayusculas = 0, minusculas = 0, numeros = 0;
		//Recoremos la contraseña letra por letra y las comprobamos
		for (int i = 0; i < contraseña.length(); i++) {
			if (contraseña.charAt(i) >= 'A' && contraseña.charAt(i) <= 'Z') {
				mayusculas+=1; // Sumamos el total de mayuúculas
			}
			if (contraseña.charAt(i) >= 'a' && contraseña.charAt(i) <= 'z') {
				minusculas+=1; // Sumamos el total de minúsculas
			}
			if (contraseña.charAt(i) >= '0' && contraseña.charAt(i) <= '9') {
				numeros+=1; // Sumamos el total de números
			}
		}
		if (mayusculas >= 2 && minusculas >= 1 && numeros >= 5) {
			return true; //Si cumple con los requisitos mínimos retornamos true
		} else {
			return false; // En caso contrario retornamos false
		}
	}

	/**
	 * @return the longitud
	 */
	public int getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	/**
	 * @return the contraseña
	 */
	public String getContraseña() {
		return contraseña;
	}
	
}
