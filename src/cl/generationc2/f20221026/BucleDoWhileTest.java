package cl.generationc2.f20221026;

import java.util.Scanner;

public class BucleDoWhileTest {

	public static void main(String[] args) {
		// doWhile
		// a lo menos se ejecuta una vez
		Scanner sc = new Scanner(System.in);
		int edad = 0;
		Float kilos = 0f;
		Float estatura = 0f;
		
		
		do {
			System.out.println("Ingresa tu estatura");
			estatura = sc.nextFloat();
		} while (estatura < 1.20 || estatura >2.50);
		System.out.println("estatura ingresado es: "+estatura);
		sc.close();
	}

}
