package com.utn.console;

public class Ejercicio2 {
	int X;
	int Y;
	double N;
	double M;
	
	Ejercicio2 (int x, int y, double n, double m) {
		X = x;
		Y = y;
		N = n;
		M = m;
	}
	
	void resolverEj2 () {
		System.out.println("X = " + X);
		System.out.println("Y = " + Y);
		System.out.println("N = " + N);
		System.out.println("M = " + M);
		System.out.println("El resultado de X sumado a Y: " + (X+Y));
		System.out.println("El resultado de N dividido M es: " + (N/M));
		System.out.println("El resultado de la multiplicación entre X y M es: " + (X*M));
	}

}
