package cl.generationc2.f20221026;

import java.util.Scanner;

public class CapturarDatos {

	public static void main(String[] args) {
		// Capturar datos ingresados por el usuario
		Float IMC = calculoIMC();
		//nivelIMC(IMC);
	}
	public static Float calculoIMC() {
		Scanner sc = new Scanner(System.in);
		// calculo del IMC(indice masa muscular);
		// imc= Kilos/(estatura*estatura);

		System.out.println("Ingrese su peso en kilogranos");
		Float kilos = sc.nextFloat();
		System.out.println("el peso del paciente es: " + kilos);
		System.out.println("ingrese su estatura en metros");
		Float estatura = sc.nextFloat();
		System.out.println("la estatura del paciente es: " + estatura);
		
		Float IMC = kilos / (estatura * estatura);
		System.out.println("Su IMC es: " + IMC);
		nivelIMC(IMC);
		sc.close();
		return IMC;
	}
	
	public static void nivelIMC(Float IMC) {
		/*
		 * Por debajo de 18.5 Bajo peso 
		 * 18.5 - 24.9 Normal 
		 * 25.0 - 29.9 Sobrepeso 
		 * 30.0 o más Obeso
		 */
		if(IMC < 18.5f) {
			System.out.println("El paciente esta en el rango BAJO PESO");
		}else if(IMC >= 18.5F && IMC < 25) {// el simbolo && significa que debe cumplir ambas condiciones
			System.out.println("El paciente esta en el rango NORMAl");
		}else if(IMC >= 25 && IMC <30) {
			System.out.println("El paciente esta en el rango SOBREPESO");
		}else {
			System.out.println("El paciente esta en el rango OBESO");
		}
	}
}
