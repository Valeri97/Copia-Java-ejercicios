package cl.generationc2.f20221024;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Integer entero = 35;
		Long largo = 182471282455l;
		Float flotante = 3.4f;
		Double decimal = 3.5d;
		
		//de Interger a:
		
		//Long
		//largo = Long.valueOf(entero);
		//
		//Float
		//flotante = Float.valueOf(entero);
		//
		//Double
		decimal = Double.valueOf(entero);
		
		//Pruebas
		System.out.println(largo);
		System.out.println(flotante);
		System.out.println(decimal);
		
		//de Long a:
		
		//Float
		flotante = Float.valueOf(largo);
		System.out.println(flotante);
		//Double
		
		
	}


	
	
	
	
}
