package com.utn.console;
import java.util.Scanner;

public class Ejercicio2 {
	int [] array = new int [10];
	int media;
	
	void resolverEj2 () {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Ingrese 10 numeros: ");
		for(int i=0;i<array.length;i++) array[i] = keyboard.nextInt();
		System.out.println("Los numeros que ingresaste en las posiciones pares son: ");
		for(int i=0;i<(array.length/2);i++) System.out.println(array[i*2]);
		for(int i=0;i<(array.length/2);i++) media = media + array[i*2];
		System.out.println("La suma de estos números da: " + media + " y su media es: " + (media/5));
	}

}
