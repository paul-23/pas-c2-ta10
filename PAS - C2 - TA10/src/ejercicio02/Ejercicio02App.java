/**
 * 
 */
package ejercicio02;

/**
 * @author paul_
 *
 */
public class Ejercicio02App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			System.out.println("Mensaje mostrado por pantalla");
			
			// Lanzamos la excepción customizada
			throw new MiExcepcion("Esto es un objeto Exception");
			
		} catch (MiExcepcion mensaje) {
			//Llamamos a la clase creada por nosotros, y nos muestra el mensaje personalizado
			System.out.println("Excepcion capturada con mensaje: " + mensaje.getMessage());
		} finally {
			//Al acabar mostramos un mensaje por pantalla
			System.out.println("Programa terminado");
		}
	}

}
