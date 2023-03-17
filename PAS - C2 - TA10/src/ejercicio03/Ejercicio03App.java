/**
 * 
 */
package ejercicio03;

import java.util.Random;

//Importamos la clase creada en el ejercicio 2
import ejercicio02.MiExcepcion;

/**
 * @author paul_
 *
 */
public class Ejercicio03App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random rand = new Random();
		try {
			System.out.println("Generando número aleatorio...");
			int num = rand.nextInt(1000); // Generamos un número aleatorio entre 0 y 999
			System.out.println("El número aleatorio generado es: " + num);

			// Comprobamos si el número es par o impar y lo asignamos al throw Exception creado en la actividad anterior
			if (num % 2 == 0) {
				throw new MiExcepcion("Es par");
			} else {
				throw new MiExcepcion("Es impar");
			}
		} catch (MiExcepcion mensaje) {
			// Mostramos el mensaje por pantalla asignado anteriormente
			System.out.println(mensaje.getMessage());
		}
	}
}
