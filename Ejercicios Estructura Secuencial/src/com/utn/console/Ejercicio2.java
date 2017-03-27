package com.utn.console;
import java.util.Scanner;

public class Ejercicio2 {
	String nombre;
	
	void resolverEj2 () {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Introduzca su nombre: ");
		nombre = keyboard.nextLine();
		System.out.println("Buenas Tardes " + nombre);
	}

}
