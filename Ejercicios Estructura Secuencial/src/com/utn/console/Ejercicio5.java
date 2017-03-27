package com.utn.console;
import java.util.Scanner;

public class Ejercicio5 {
	int radio;
	
	void resolverEj5 () {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Ingrese el radio de la circunferencia: ");
		radio = keyboard.nextInt();
		System.out.println("Longitud de la circunferencia = " + (2*3.14*radio));
		System.out.println("Área de la circunferencia= " + (radio*radio*3.14));
	}

}
