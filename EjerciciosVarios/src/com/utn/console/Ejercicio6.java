package com.utn.console;

public class Ejercicio6 {
	int B;
	
	Ejercicio6 (int b) { 
		B = b;
	}

	void resolverEj6 () {
		System.out.println("B = " + B);
		System.out.println("El número " + B + " es un número " + ((B>=0)?"positivo":"negativo"));
	}
}
