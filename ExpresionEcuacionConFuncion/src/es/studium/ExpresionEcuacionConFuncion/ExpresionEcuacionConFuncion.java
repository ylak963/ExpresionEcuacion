package es.studium.ExpresionEcuacionConFuncion;

import java.util.Scanner;

public class ExpresionEcuacionConFuncion {
	public static void main(String[] args) {
		int a, b, c;
		// double resultado;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el valor de a:");
		a = teclado.nextInt();

		System.out.println("Introduce el valor de b:");
		b = teclado.nextInt();

		System.out.println("Introduce el valor de c:");
		c = teclado.nextInt();

		System.out.println(funcionEcuacion(a, b, c));
		teclado.close();

	}

	private static double funcionEcuacion(int a, int b, int c) {
		return ((b * b) - (4 * a * c)) / 2 * a;
	}

}
