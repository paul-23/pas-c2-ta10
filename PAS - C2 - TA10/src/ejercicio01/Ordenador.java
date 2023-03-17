/**
 * 
 */
package ejercicio01;

import java.util.*;

/**
 * @author paul_
 *
 */
public class Ordenador {
	private int generarNumero;
	private int intentos;

	public Ordenador() {
		this.generarNumero = (int) (Math.random() * 500) + 1;
		this.intentos = 0;
	}

	public void adivinar() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			try {
				System.out.print("\nIntroduce un número entre 1 y 500: ");
				
				int numeroIntroducido = scanner.nextInt();
				this.intentos++;

				if (numeroIntroducido == this.generarNumero) {
					if (this.intentos == 1) {
						System.out.println("Has adivinado el número en " + this.intentos + " intento");
					} else if (this.intentos > 1) {
						System.out.println("Has adivinado el número en " + this.intentos + " intentos");
					}
					break;
				} else if (numeroIntroducido < this.generarNumero) {
					System.out.println("El número que tienes que adivinar es mayor que " + numeroIntroducido);
				} else {
					System.out.println("El número que tienes que adivinar es menor que " + numeroIntroducido);
				}

			} catch (InputMismatchException e) {
				System.out.print("\n-----------\nVALOR INCORRECTO."
					+ "\nIntroduce un número entre 1 y 500: ");
				scanner.next();
			}
		}
		scanner.close();
	}
}
