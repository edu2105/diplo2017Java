package com.utn.console;

public class Ejercicio5 {
	int A;
	
	Ejercicio5 (int a) {
		A = a;
	}

	void resolverEj5 () {
		System.out.println("A = " + A);
		System.out.println("El n�mero " + A + " es un n�mero " + (((A%2) == 0)?"Par":"Impar"));
		}
	}
