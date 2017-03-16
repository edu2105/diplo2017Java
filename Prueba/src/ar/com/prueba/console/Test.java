package ar.com.prueba.console;

public class Test {
	//Calculo si un numero es primo o no y lo imprimo
	public static void main (String argv[]) {
		int n = 336;
		int counter = 0;
		for (int i=1; i<=n; i++) if (n % i == 0) counter++;
		if (counter==2) System.out.println("El numero " + n + " es primo");
		else System.out.println("El numero " + n + " no es primo");
	}
}
