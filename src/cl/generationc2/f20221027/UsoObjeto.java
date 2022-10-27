package cl.generationc2.f20221027;

public class UsoObjeto {

	public static void main(String[] args) {
		// Instancia de clase
		// no se importa porque esta dentro de la misma caja
		// una instancia es un clase de tipo auto
		Auto auto1 = new Auto(); //new es inicializar 
							     //entre parentesis es el constructor 
		//auto1.color= "Negro"; //la unica forma de asignar un valor es con getter & setters
							// es privado color
							// asignar valores a los atributos privados
		auto1.setColor("color");//set es mutar/sobreescribir
		auto1.setMarca("nissan");// set es mutar, cambia etc
		
		//consultar el contenido de los productos
		System.out.println(auto1.getColor());
		System.out.println(auto1.getMarca());
		System.out.println(auto1.getModelo());
		
		//saber el contenido de los atributos
		System.out.println(auto1.toString());
		
		//nueva instancia de auto
		
		//consultar el contenido de los atributos
		Auto car = new Auto("Nissan "," Negro"," Qasqai",1.6f,10.0f,240f);
		System.out.println(car.getColor());
		System.out.println(car.getMarca());
		System.out.println(car.getModelo());
		System.out.println(car.getCilindrada());
		System.out.println(car.getVelocidad());
		
		Auto.setCilindrada();
		
		//saber el contenido de los atributos
		System.out.println(car.toString());
		
		

	}

}
