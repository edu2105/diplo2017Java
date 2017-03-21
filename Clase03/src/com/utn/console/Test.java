package com.utn.console;

public class Test {
	public static void main (String args[]) {
		String nombreDelUsuario ="Pepe";
		bienvenida (); //llamamos o invocamos al metodo
		saludoUsuario (nombreDelUsuario); //en String nombre guardamos el valor "dante"
		despedida(); //llamamos o invocamos al metodo
		calculoIMC("Eduardo","Sanhueso",82,1.75,27);
	}
	
	//Crearemos un metodo de tipo procedimiento
	/*
	 * Dara la bienvenida al sistema
	 * bienvenida
	 * no contiene firma (parametros)
	 */
	public static void bienvenida () {
		System.out.println("Bienvenidos a la aplicacion!! :)"); 
	}
	
	
	//Creo otro metodo de tipo procedimiento que despide al usuario
	public static void despedida () {
		System.out.println("Gracias por utilizar la aplicacion!! :)");
	}
	
	
	//Creamos un metodo en el cual le damos la bienvenida al usuario
	//"final" hace que no se pueda modificar la variable que entra como parametro
	public static void saludoUsuario (final String user){
		System.out.println("Bienvenido " + user);
	}
	
	//Creamos un metodo de tipo procedimiento en el cual se ingresen 2 parametros y se muestre el valor en consola
	public static void calculoIMC (String nombre, String apellido, double peso, double altura, int edad) {
				String resultadoIMC = "lala";
				double resultado = peso / (altura * altura);
				if (resultado < 18) resultadoIMC ="Signos de desnutricion";
				else if (resultado >= 18 && resultado < 24.9) resultadoIMC = "Normal";
				else if (resultado >= 25 && resultado < 26.9) resultadoIMC = "Sobrepeso";
				else if (resultado >= 27) resultadoIMC = "Obesidad";
				System.out.println("Sr/a: "+ nombre + " " + apellido + " su diagnostico es: " + resultadoIMC);
	}
}