package cl.generationc2.f20221024;

import java.util.Arrays;

public class Arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Arreglos en Java 
	/*Arreglos (Array) en Java
		(estaticos, no cambia de tamaño*/
		
	int[] arreglo= new int[3];
	// tipodedato[] nombredelarray=new tipodedato[cantidad de datos a almacenar];
	//arreglo.length; tamaño del arreglo		
	// agregar datos
		arreglo[0]=4;
		arreglo[1]=8;
		arreglo[2]=12;
		//arreglo[3]=24;
		System.out.println(arreglo.toString());
		System.out.println(Arrays.toString(arreglo));
		System.out.println(arreglo[0]);
	
		//{}

		int[] sinNumeros = {};//cero
		System.out.println(sinNumeros.length);
		//sinNumeros[0]=78;//para un arreglo vacio NO SE PUEDE
		System.out.println(Arrays.toString(sinNumeros));

				//crear un array de numeros flotantes de tamaño 6.
				
				
				float[] numeros= new float[6];//{1,2,3,4,5,6};
				//agregar 6 elementos al arreglo
				numeros [0]= 33;//33.0
				numeros[0]= -0.6f;
				
				int[] numeroInt= new int[2];
				numeroInt[0]=(int) 0.2;//0.0
				System.out.println(numeroInt[0]);
				
				/*
				 * crear un arreglo de enteros tamaño 100
				 * y agregar valores dinamicamente,
				 * desde el 1 al 100
				 */
				
				
				int[] arreglo4 = new int[100];
				for (int i = 0; i < arreglo4.length; i = i + 1) {
					arreglo4[i] = i+1;
				}
				
				System.out.println(Arrays.toString(arreglo4));
				
				
				int[] arreglo100a1 = new int[100];
				//{100,99,98,97...0}
				for(int i =arreglo100a1.length; i>0  ;i-- ) {
					arreglo100a1[arreglo100a1.length - i]= i;
				}
				
				
				
	}

}
