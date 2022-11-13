package cl.generationc2.f20221027;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		menu();
		// Menu
		// Calculadora con 4 operaciones basicas
		// imprimir resultados guardar en una variable
		// ofrecer opciones
		// definir metodos
		// validaciones
		// terminar la ejecucion
		// limpiar las variables
		// solicitar y capturar los numeros

	}

	public static void menu() {
		System.out.println("*********************************");
		System.out.println("           MENU          ");
		System.out.println("**********************************");
		System.out.println("*1.-       SUMAR                  *");
		System.out.println("*2.-       RESTAR                 *");
		System.out.println("*3.-       MULTIPLICAR            *");
		System.out.println("*4.-       DIVIDIR                *");
		System.out.println("*0.-        SALIR                 *");
		System.out.println("***********************************");

		Scanner sc = new Scanner(System.in);
		int opciones = 0;
		int contadorErrores = 4;

		do {
			System.out.println("* seleccion una opcion *");
			opciones = sc.nextInt();

			// si la opcion es cero, salir del do-while

			if (opciones == 0) {
				System.out.println("Usted a salido del programa");
				break;// BREAK SE USA PARA SALIR, PAUSA
			} else if (opciones < 0 || opciones > 4) {// condicion de error
				contadorErrores--;
				System.out.println("te quedan " + contadorErrores + " intentos");

			}
			if (contadorErrores == 0) {
				System.out.println("Agoto la cantidad de intentos mi rey -.-");
				break;// BREAK SE USA PARA PARA SALIR, PAUSA
			}

		} while (opciones < 0 || opciones > 4);

		if (opciones == 0 || contadorErrores == 0) {
			System.out.println("Adios!!!");
		} else {// solo ingresara para opciones 1,2,3,4
			
		}//solicitar 2 numeros
		System.out.println("ingresa primer numero");
		float numero1 = sc.nextFloat();
		System.out.println("ingresa segundo numero");
		float numero2 = sc.nextFloat();
		
		float resultado=0; 
		
		switch (opciones) {
		case 1://suma
			resultado = numero1 + numero2;
			System.out.println("el resultado es: "+resultado);
			break;
		case 2://resta
			resultado = numero1 - numero2;
			System.out.println("el resultado es: "+resultado);
			
			break;
		case 3:// dividir
			if ( numero2==0) {
				System.out.println("NO SE PUEDE DIVIDIR POR CERO");
			}else {
			resultado = numero1 / numero2;
			System.out.println("el resultado es: "+resultado);
			}
			break;
		case 4:// multiplicar
			resultado = numero1 * numero2;
			System.out.println("el resultado es: "+resultado);

			break;

		default:
			System.out.println("Opcion no valida");
			break;
		}
	}
}
