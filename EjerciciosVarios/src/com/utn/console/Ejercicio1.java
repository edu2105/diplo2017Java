package com.utn.console;

public class Ejercicio1 {
	
	int N;
	double A;
	char C;
	
	Ejercicio1 (int entero, double doble, char caracter) {
		N = entero;
		A = doble;
		C = caracter;
	}
	
	void resolverEj1 () {
		System.out.println("El valor de N es: " + N);
		System.out.println("El valor de A es: " + A);
		System.out.println("El valor de C es: " + C);
		System.out.println("La suma de N + A es: " + (N+A));
		System.out.println("La diferencia de A - N es: " + (A-N));
		System.out.println("El valor numérico de C es: " + (int) C);
	}

}
