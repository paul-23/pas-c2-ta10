/**
 * 
 */
package ejercicio02;

/**
 * @author paul_
 *
 */
public class MiExcepcion extends Exception{

	//Llamamos a la clase padre Exception, pero le pasamos como valor el mensaje generado por nosotros
	public MiExcepcion(String mensaje) {
		super(mensaje);
	}

}
