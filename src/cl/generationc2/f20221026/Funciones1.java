package cl.generationc2.f20221026;

import java.util.Arrays;

public class Funciones1 {
	public static void main(String[] args) {
		// FUNCIONES o METODOS

		// llamar a un metodo
		nombreMetodo();
		metodo2("cualquier cosa");
		metodo2("palma");
		metodo3(3);
		metodo4(77, 9.9F);
		String[] vocales = { "a", "e", "i", "o", "u" };
		metodo5(vocales);
		// llamado retorno1
		// System.out.println(retorno1());

		Integer valorRetornado = retorno1();
		System.out.println(valorRetornado);
		System.out.println(valorRetornado / 7);
		System.out.println(valorRetornado / 5);

		String nombreCompleto = obtenerNombreCompleto("Federico", "Smith", "Sparrow");
		System.out.println("el nombre completo es: "+nombreCompleto);
		//swagger (invesitgar a cerca de documentar).
		llamadaAOtroMetodo();
	}
	// definicion o estructura de un metodo
	// void --> el metodo no retorna ningun valor,
	public static void nombreMetodo() {
		System.out.println("Estoy dentro del metodo inicial...");
	}
	public static void metodo2(String nombre) {// nombre es un tipo de dato
		System.out.println("soy " + nombre);
	}

	public static void metodo3(Integer numero) {// nombre es un tipo de dato
		System.out.println("soy el numero " + numero);

	}

	public static void metodo4(Integer numero1, Float numero2) {// nombre es un tipo de dato
		System.out.println("soy el numero " + numero1);
		System.out.println("soy el numero " + numero2);

	}

	public static void metodo5(String[] arreglito) {
		System.out.println("Soy el arreglo " + Arrays.toString(arreglito));

	}

	// funciones con retorno
	public static Integer retorno1() {
		Integer Totalalumnos = 35;
		return Totalalumnos;
	}

	/**
	 * 
	 * Metodo que une todos los datos// primero se crea el metodo. 
	 * 
	 * @param nombre
	 * @param apeMaterno
	 * @param apePaterno
	 * @return nombreCompleto
	 */
	public static String obtenerNombreCompleto(String nombre, String apeMaterno, String apePaterno) {
		String nombreCompleto = nombre + " " + apeMaterno+ " " + apePaterno+ " ";
		return nombreCompleto;// retornamos el contenido de la variable
	}
	
	//metodo que llama a otro metodo(recordar funcion tambien se llama "metodo")
	
	public static void llamadaAOtroMetodo() {
		System.out.println("llamada a otro metodo desde un metodo");
		metodo4(74,9.9F);//aqui estamos llamando a otro funcion desde otra funcion.
	}
	
}
