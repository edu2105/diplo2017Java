package com.utn.console;

public class Test {
	
	//variables
	static String bienvenida = "Bienvenidos a nuestra aplicacion!!!";
	static String despedida = "Gracias por elegirnos!!";
	static String nombre = "Eduardo";
	static String apellido = "Sanhueso";
	static int edad = 13;
	

	public static void main(String[] args) {		
		if ((edad>=18)&&(apellido=="Sanhueso")){
		//libreria que permite mostrar por la consola valores
		System.out.println(bienvenida);
		
		//llamada a un metodo estatico de la misma clase
		datosPersonales();
		
		//llamada a un metodo estatico de la misma clase
		despedida();
		
		//no estoy concatenando sino que estoy sumando
		System.out.println(2+2);
		
		//al poner un string al principio todo lo que venga despues del + lo toma como un string
		System.out.println("La concatenacion es " + 2 + 2);
		
		}
		else {
			System.out.println("Usted es menor de edad y no puede ingresar al sistema");
		}
		
		switch (edad) {
		case 13:
			System.out.println("Puede ver peliculas desde 13 años");
			break;
		case 18:
			System.out.println("Puede ver peliculas desde 18 años");
			break;
		case 25:
			System.out.println("Puede ver peliculas desde 25 años");
			break;
		default:
			System.out.println("Lo sentimos no puede ver peliculas");
			break;
		}
	}
	
	
	//metodo estatico que imprime unas palabras por la consola
	public static void despedida (){
	System.out.println(despedida);
	}
	
	
	//metodo estatico que imprime datos personales
	//la concatenacion es la union de variables
	//uno objetos
	public static void datosPersonales(){
		System.out.println("Nombre: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad + ".");
		//System.out.println(apellido);
		//System.out.println(edad);
	}
	
}
