package cl.generationc2.f20221026;

import java.util.Scanner;

public class TareaEnEquipo_IMC1 {

	public static void main(String[] args) {
		// Tara en equipo IMC 1
		String name = NombreUsuario();
	}
	public static String NombreUsuario(){
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese su nombre: ");
		String Name = sc.next(); 
		System.out.println("El nombre es: "+ Name);
		sc.close();
		return("");
	}
	
}
