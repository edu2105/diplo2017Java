package com.utn.console;
import java.util.Scanner;

public class Ejercicio10 {
	static int numero;
	static boolean flag = true;
	
	public static void resolverEj10 () {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Ingrese un n�mero de 3 cifras: ");
		numero = keyboard.nextInt();
		while (flag) {
		if (numero/100 < 10 && numero/100>=1) {
			System.out.println("El n�mero ingresado es: " + numero + " y sus cifras son:");
			System.out.println((numero/100) + " " +  ((numero/10)%10) + " " + (numero%10)); 
			flag = false;
		}
		else {
			System.out.println("El n�mero ingresado no es de 3 cifras, ingrese un n�mero v�lido: ");
			numero = keyboard.nextInt();
		}
		}
	}
	
	public static String saludo () {
		return "hola";
	}

}
