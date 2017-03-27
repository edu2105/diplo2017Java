package com.utn.console;

public class Ejercicio4 {
	int A;
	int B;
	int C;
	int D;
	
	Ejercicio4 (int a, int b, int c, int d) {
		A = a;
		B = b;
		C = c;
		D = d;		
	}
	
	void resolverEj4 () {
		System.out.println("El valor de A es: " + A );
		System.out.println("El valor de B es: " + B );
		System.out.println("El valor de C es: " + C );
		System.out.println("El valor de D es: " + D );
		B = C;
		C = A;
		A = D;
		D = B;
		System.out.println("Ahora el valor de A es: " + A );
		System.out.println("Ahora el valor de B es: " + B );
		System.out.println("Ahora el valor de C es: " + C );
		System.out.println("Ahora el valor de D es: " + D );
	}

}
