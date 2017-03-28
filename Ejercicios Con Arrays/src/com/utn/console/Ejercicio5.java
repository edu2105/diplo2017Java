package com.utn.console;
import java.util.Scanner;

public class Ejercicio5 {
	int[] vector = new int[10];
	int negativos = 0;
	int positivos = 0;
	int ceros = 0;

	void resolverEj5 () {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Escriba 10 números: ");
		for (int i=0; i<vector.length; i++) vector[i] = keyboard.nextInt();
		for (int i=0; i<vector.length; i++) {
			if (vector[i] < 0) negativos++;
			else if (vector[i] > 0) positivos++;
			else ceros++;
		}
		System.out.println("Usted ha ingresado: ");
		System.out.println(negativos + " números negativos");
		System.out.println(ceros + " ceros");
		System.out.println(positivos + " números positivos");
	}

}
