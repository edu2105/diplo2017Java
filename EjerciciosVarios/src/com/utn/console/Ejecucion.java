package com.utn.console;

public class Ejecucion {
	public static void main (String argv[]) {
	Ejercicio1 ej1 = new Ejercicio1 (20, 30.1, 'c');
	Ejercicio2 ej2 = new Ejercicio2 (2, 4, 128.01, 10.01);
	Ejercicio3 ej3 = new Ejercicio3 (85);
	Ejercicio4 ej4 = new Ejercicio4 (10, 20, 30, 40);
	Ejercicio5 ej5 = new Ejercicio5 (33);
	Ejercicio6 ej6 = new Ejercicio6 (-50);
	Ejercicio7 ej7 = new Ejercicio7 (25);
	
	System.out.println("Ejercicios Básicos Iniciales Para Principiantes");
	System.out.println("");
	System.out.println("********************************************************");
	System.out.println("Ejercicio 1:");
	ej1.resolverEj1();
	System.out.println("********************************************************");
	System.out.println("Ejercicio 2:");
	ej2.resolverEj2();
	System.out.println("********************************************************");
	System.out.println("Ejercicio 3:");
	ej3.resolverEj3();
	System.out.println("********************************************************");
	System.out.println("Ejercicio 4:");
	ej4.resolverEj4();
	System.out.println("********************************************************");
	System.out.println("Ejercicio 5:");
	ej5.resolverEj5();
	System.out.println("********************************************************");
	System.out.println("Ejercicio 6:");
	ej6.resolverEj6();
	System.out.println("********************************************************");
	System.out.println("Ejercicio 7:");
	ej7.resolverEj7();
	}

}
