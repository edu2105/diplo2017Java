package com.utn.console;
import java.util.Scanner;

public class Ejercicio1 {
	int A;
	int B;
	
	void resolverEj1 () {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Ingrese el primer número: ");
		A = keyboard.nextInt();
		System.out.println("Ingrese el segundo número: ");
		B = keyboard.nextInt();
		System.out.println("Los números ingresados fueron: " + A + " y " + B);
	}

}
