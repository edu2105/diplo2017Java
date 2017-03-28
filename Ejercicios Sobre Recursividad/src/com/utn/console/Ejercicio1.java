package com.utn.console;
import java.util.Scanner;

public class Ejercicio1 {
	int a;
	int b;
	int resultado = 0;

	void resolverEj1 () {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Ingrese 2 numeros enteros: ");
		a = keyboard.nextInt();
		b = keyboard.nextInt();
		resultado = calcularCociente (a,b);
		if (resultado >= 0) System.out.println("El resultado del cocientre entre a y b es: " + resultado);
		else System.err.println("El cociente entre a y b no puede determinarse ya que b = 0");
	}

	int calcularCociente (int x, int y) {
		if (x==0) return 0;
		if (x<0) return -1;
		if (y==0) return -99999;
		else return (1 + (calcularCociente(x-y,y)));
	}
}