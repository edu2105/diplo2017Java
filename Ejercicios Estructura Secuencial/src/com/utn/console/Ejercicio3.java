package com.utn.console;
import java.util.Scanner;

public class Ejercicio3 {
	int C;
	
	void resolverEj3 () {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Ingrese un n�mero: ");
		C = keyboard.nextInt();
		System.out.println("El n�mero ingresado es " + C);
		System.out.println("El doble de " + C + " es " + (C*2) + " y el triple es " + (C*3));
	}

}
