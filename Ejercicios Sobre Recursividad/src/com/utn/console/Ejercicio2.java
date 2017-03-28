package com.utn.console;
import java.util.Scanner;

public class Ejercicio2 {
	int n;
	String bin;

	void resolverEj2 () {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Ingrese un numero: ");
		n = keyboard.nextInt();
		bin = decimalABinario(n);
		System.out.println(n + " en binario es: 0x" + bin);
	}

	String decimalABinario (int x) {
		if (x==0) return "0";
		if (x==1) return "1";
		else return (decimalABinario(x/2) + decimalABinario(x%2));
	}
}