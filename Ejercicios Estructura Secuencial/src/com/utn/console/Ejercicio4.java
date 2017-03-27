package com.utn.console;
import java.util.Scanner;

public class Ejercicio4 {
	int grados;
	
	void resolverEj4 () {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Ingresa una temperatura en grados centígrados: ");
		grados = keyboard.nextInt();
		System.out.println(grados + "°C = " + (32 + (9*grados/5)) + "°F");
	}

}
