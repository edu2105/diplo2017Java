package com.utn.console;
import java.util.Scanner;

public class Ejercicio1 {
	int A;
	int B;
	
	void resolverEj1 () {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Ingrese el primer n�mero: ");
		A = keyboard.nextInt();
		System.out.println("Ingrese el segundo n�mero: ");
		B = keyboard.nextInt();
		System.out.println("Los n�meros ingresados fueron: " + A + " y " + B);
	}

}
