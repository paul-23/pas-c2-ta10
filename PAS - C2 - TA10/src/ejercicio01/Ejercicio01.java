/**
 * 
 */
package ejercicio01;

/**
 * @author paul_
 *
 */
public class Ejercicio01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Creamos un objeto que llama a la Clase Ordenador
		Ordenador generarNumeros = new Ordenador();
		
		System.out.println("----------- ADIVINA EL NÚMERO -----------");
		//Iniciamos el programa para adivinar los números
		generarNumeros.adivinar();
	}

}
