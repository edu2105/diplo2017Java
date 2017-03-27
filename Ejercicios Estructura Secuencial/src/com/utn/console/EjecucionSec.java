package com.utn.console;

public class EjecucionSec {
	public static void main (String argv[]) {
		Ejercicio1 ej1 = new Ejercicio1();
		Ejercicio2 ej2 = new Ejercicio2();
		Ejercicio3 ej3 = new Ejercicio3();
		Ejercicio4 ej4 = new Ejercicio4();
		Ejercicio5 ej5 = new Ejercicio5();
		Ejercicio10 ej10 = new Ejercicio10();
				
		
		System.out.println("Ejercicios Básicos Con Estructura Secuencial");
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
		System.out.println("Ejercicio 10:");
		ej10.resolverEj10();
	}
}
