/**
 * 
 */
package ejercicio04;

import java.util.Scanner;

import ejercicio02.MiExcepcion; // Importamos la clase

/**
 * @author paul_
 *
 */
public class Operaciones {
	private double num1;
	private double num2;
	private int option;

	public void Calcular() {
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;

		try {
			// Pedimos operaciones hasta que salte un error o decidamos salir
			do {
				// Mostramos el menú por pantalla
				System.out.println(
						"\n----------------------\nIntroduce la operación que quieres realizar:\n1. Suma\n2. Resta\n3. Multiplicación"
								+ "\n4. Potencia\n5. Raíz cuadrada\n6. Raíz cúbica\n7. División\n8. Salir\n----------------------");
				System.out.print("Ingresa el número: ");
				option = scanner.nextInt(); // Seleccionamos la opción que deseamos
				scanner.nextLine();
				double resultado = 0;

				switch (option) {
				case 1: // Suma
					pedirDosValores(scanner); // Pedimos dos valores por teclado
					resultado = num1 + num2;
					System.out.println("- SUMA -\n" + num1 + " + " + num2 + " = " + resultado);
					break;
				case 2: // Resta
					pedirDosValores(scanner); // Pedimos dos valores por teclado
					resultado = num1 - num2;
					System.out.println("- RESTA -\n" + num1 + " - " + num2 + " = " + resultado);
					break;
				case 3: // Multiplicacion
					pedirDosValores(scanner); // Pedimos dos valores por teclado
					resultado = num1 * num2;
					System.out.println("- MULTIPLICACIÓN -\n" + num1 + " * " + num2 + " = " + resultado);
					break;
				case 4: // Potencia
					pedirDosValores(scanner); // Pedimos dos valores por teclado
					resultado = Math.pow(num1, num2);
					System.out.println("- POTENCIA -\n" + num1 + " ^ " + num2 + " = " + resultado);
					break;
				case 5: // Raiz cuadrada
					pedirUnValor(scanner); // Pedimos un valor por teclado
					if (num1 < 0) { // Comprobamos que el valor sea mayor que 0
						throw new MiExcepcion("No se puede hacer la raíz cuadrada de un número negativo");
					}
					resultado = Math.sqrt(num1);
					System.out.println("- RAÍZ CUADRADA -\nRaíz cuadrada de " + num1 + " = " + resultado);
					break;
				case 6: // Raiz cúbica
					pedirUnValor(scanner); // Pedimos un valor por teclado
					resultado = Math.cbrt(num1);
					System.out.println("- RAÍZ CÚBICA -\nRaíz cúbica de " + num1 + " = " + resultado);
					break;
				case 7: // División
					pedirDosValores(scanner); // Pedimos dos valores por teclado
					if (num2 == 0) { // Comprobamos que el valor no sea 0
						throw new MiExcepcion("No se puede dividir entre 0");
					}
					resultado = num1 / num2;
					System.out.println("- DIVISIÓN -\n" + num1 + " / " + num2 + " = " + resultado);
					break;
				case 8: // Salimos del programa
					exit = true;
					System.out.println("Programa terminado.");
					break;
				default: // En caso de que no se seleccione una opcion correcta
					throw new MiExcepcion("Selección de operación incorrecta.");
				}
			} while (!exit);

		} catch (Exception mensaje) { // Mostramos el mensaje de error
			System.out.println("\n---------- Error ----------");
			System.out.println(mensaje.getMessage());
		}
		scanner.close();
	}

	public void pedirDosValores(Scanner sc) { // Pedimos dos números por teclado
		System.out.println("Introduce el primer número: ");
		num1 = sc.nextDouble();
		System.out.println("Introduce el segundo número: ");
		num2 = sc.nextDouble();
	}

	public void pedirUnValor(Scanner sc) { // Pedimos un número por teclado
		System.out.println("Introduce un número: ");
		num1 = sc.nextDouble();
	}
}
