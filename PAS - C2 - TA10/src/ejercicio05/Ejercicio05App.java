/**
 * 
 */
package ejercicio05;

import java.util.Scanner;

import ejercicio02.MiExcepcion;

/**
 * @author paul_
 *
 */
public class Ejercicio05App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		try {
			int longitudLista, longitud;
			// Pedimos por teclado la longitud de la lista y de la contraseña
			System.out.print("\n----------- Generar contraseña -----------"
					+ "\nIntroduce la longitud de la lista: ");
			longitudLista = scanner.nextInt();
			System.out.print("Introduce la longitud de la contraseña: ");
			longitud = scanner.nextInt();
			
			// Creamos el array de contraseñas y booleanos de contraseñas fuertes
			Password listaContraseñas[] = new Password[longitudLista];
			boolean contraseñaFuerte[] = new boolean[longitudLista];

			for (int i = 0; i < listaContraseñas.length; i++) {
				// Recorremos el array y generamos una contraseña con la longitud indicada
				listaContraseñas[i] = new Password(longitud);
				// Comprobamos si la contraseña es fuerte
				contraseñaFuerte[i] = listaContraseñas[i].esFuerte();
				// Lo mostramos por pantalla
				System.out.println("Contraseña " + (i + 1) + ": " + listaContraseñas[i].getContraseña() + " | " + contraseñaFuerte[i]);
			}
			
		// Hacemos un try catch para comprobar que los valores de longitud introducidos son correctos
		} catch (Exception mensaje) {
			// En caso de que los valores sean incorrectos mostramos un mensaje de error
			System.out.println("¡ Valor de longitud incorrecto !");
		} finally {
			// Al final del programa cerramos el scanner
			scanner.close();
		}
	}

}
