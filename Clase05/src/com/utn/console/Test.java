package com.utn.console;

public class Test {
		public static void main (String argv[]) {	
		
			//Creo una instancia de la clase Persona
			Persona p1 = new Persona(); //despues explicaremos por que los parentesis
			
			//p1 es un nuevo objeto de la clase persona
			//p1 es una nueva instancia de persona
			
			p1.nombre="Pablo";
			p1.apellido="Sanchezmann";
			p1.edad=44;
			String[] alimentos = {"Hamburguesa","Papas"};
			
			System.out.println("=========Persona 1================");
			System.out.println("El objeto p1.nombre= " + p1.nombre);
			System.out.println("El objeto p1.apellido= " + p1.apellido);
			System.out.println("El objeto p1.edad= " + p1.edad);
			p1.comer(alimentos);
			System.out.println("El valor del objeto p1 es: " + p1);
			
			Persona p3 = new Persona();
			p3.nombre="Nicolas";
			p3.apellido="Gagliardi";
			p3.edad=30;
			String[] alimentosVeganos = {"Fideos Veganos","Pan Vegano"};
	
			System.out.println("=========Persona 2================");
			System.out.println("El objeto p3.nombre= " + p3.nombre);
			System.out.println("El objeto p3.apellido= " + p3.apellido);
			System.out.println("El objeto p3.edad= " + p3.edad);
			System.out.println("El valor del objeto p3 es: " + p3);
			p3.comer(alimentosVeganos);
			
			
			System.out.println("=========CLASE AUTO================");
			Auto a1 = new Auto();
			Auto a2 = new Auto();
			a1.velocidad= 40;
			a1.marca="BMW";
			a1.año=2008;
			a2.velocidad= 0;
			a2.marca="Ferrari";
			a2.año=2011;
			
			
			System.out.println("El auto " + a1.marca + " esta: " + a1.Encender(true));
			System.out.println("El auto " + a2.marca + " esta: " + a2.Encender(false));
			System.out.println("La velocidad maxima del auto " + a1.marca + " es: " + a1.VelocidadMaxima(a1.marca, a1.año));
			System.out.println("La velocidad maxima del auto " + a2.marca + " es: " + a2.VelocidadMaxima(a2.marca, a2.año));
			System.out.println("La velocidad del auto " + a1.marca + " es de " + a1.velocidad + " km/h, esta apagado =  " + a1.Apagar(a1.velocidad));
			System.out.println("La velocidad del auto " + a2.marca + " es de " + a2.velocidad + " km/h, esta apagado =  " + a1.Apagar(a2.velocidad));
	}
	
}
