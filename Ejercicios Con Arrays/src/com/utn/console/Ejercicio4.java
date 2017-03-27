package com.utn.console;
import java.util.Scanner;

public class Ejercicio4 {
	int array[];
	int arrayValoresPares[];
	int cantPares = 0;
	int indice = 0;
	int indiceValorPares = 0;
	
	void resolverEj4 () {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Ingrese números: ");
		while (cantPares < 5) {
			array[indice] = keyboard.nextInt();
			if(array[indice]%2 == 0) {
				arrayValoresPares[indiceValorPares] = array[indice];
				cantPares++;
				indiceValorPares++;
			}
			indice++;
		}
		System.out.println("Los 5 valores pares que ingresaste fueron: ");
		for(int i=0;i<5;i++) System.out.println(arrayValoresPares[i]);
	}

}
