package com.utn.console;

public class Ejercicio6 {
	int B;
	
	Ejercicio6 (int b) { 
		B = b;
	}

	void resolverEj6 () {
		System.out.println("B = " + B);
		System.out.println("El n�mero " + B + " es un n�mero " + ((B>=0)?"positivo":"negativo"));
	}
}
