package com.utn.console;

public class Test {
	
	//variables
	static String bienvenida = "Bienvenidos a nuestra aplicacion!!!";
	static String despedida = "Gracias por elegirnos!!";
	static String nombre = "Eduardo";
	static String apellido = "Sanhueso";
	static int edad = 27;
	

	public static void main(String[] args) {
		//libreria que permite mostrar por la consola valores
		System.out.println(bienvenida);
		
		//llamada a un metodo estatico de la misma clase
		despedida();
		
		//llamada a un metodo estatico de la misma clase
		datospersonales();
	}
	
	
	//metodo estatico que imprime unas palabras por la consola
	public static void despedida (){
	System.out.println(despedida);
	}
	
	
	//metodo estatico que imprime datos personales
	public static void datospersonales(){
		System.out.println(nombre);
		System.out.println(apellido);
		System.out.println(edad);
	}
	
}
