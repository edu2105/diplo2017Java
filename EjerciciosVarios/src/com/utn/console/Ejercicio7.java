package com.utn.console;

public class Ejercicio7 {
	int C;
	
	Ejercicio7 (int c) {
		C = c;
	}

	void resolverEj7 () {
		System.out.println("C = " + C);
		System.out.println("El n�mero " + C + " es un n�mero " + ((C>=0)?"positivo":"negativo"));
		System.out.println("El n�mero " + C + " es un n�mero " + ((C%2 == 0)?"par":"impar"));
		System.out.println("El n�mero " + C + ((C%5 == 0)?" es":" no es") + " m�ltiplo de 5");
		System.out.println("El n�mero " + C + ((C%10 == 0)?" es":" no es") + " m�ltiplo de 10");
		System.out.println("El n�mero " + C + ((C>100)?" es mayor que 100":((C==100)?" es igual a 100":" es menor que 100")));
	}
}
