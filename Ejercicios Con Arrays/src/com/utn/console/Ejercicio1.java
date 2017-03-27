package com.utn.console;
import java.util.Scanner;

public class Ejercicio1 {
	int [] numeros = new int[5];
	int media;
	
	void resolverEj1 () {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Ingrese 5 números enteros: ");
		for (int i = 0; i < numeros.length; i++) numeros[i] = keyboard.nextInt();
		System.out.println("Has ingresado los siguientes números: ");
		for(int j = 0; j < numeros.length; j++) System.out.println(numeros[j]);
		for(int k = 0; k < numeros.length; k++) media = media + numeros[k];
		System.out.println("La suma total da: " + media + " y la media es: " + (media/5));
	}

}
