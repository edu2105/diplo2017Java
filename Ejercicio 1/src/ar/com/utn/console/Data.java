package ar.com.utn.console;

public class Data {
	

	//Variables
	String nombre;
	String apellido;
	int dni;
	char sexo;
	int mes;
	int año;
	String nacionalidad;
	String domicilio;
	int mesActual;
	int añoActual;
	int antecedentes;

	//Building constructor Data
	Data (String n, String a, int doc, char sex, int month, int year, String origin, String domi, int mesAct, int añoAct, int ante)
	{
		nombre = n;
		apellido = a;
		dni = doc;
		sexo = sex;
		mes = month;
		año = year;
		nacionalidad = origin;
		domicilio = domi;
		mesActual = mesAct;
		añoActual = añoAct;
		antecedentes = ante;
	}

	//Class method to work all the data
	void imprimirDatos () {

		System.out.println("*****************************************************************");
		System.out.println("*		DNI: " + dni + "					*");
		System.out.println("*		Apellido: " + apellido + "				*");
		System.out.println("*		Nombre: " + nombre + "				*");
		System.out.println("*		Fecha de Nacimiento: " + mes + " / " + año + "			*");
		System.out.println("*		Domicilio: " + domicilio + "			*");
		System.out.println("*		Sexo: " + sexo + "						*");
		System.out.println("*		Nacionalidad: " + nacionalidad + "				*");
		System.out.println("*		Vigencia: " + calcularVigencia(mesActual, añoActual, antecedentes) + " años" + "				*");
		System.out.println("*		Fecha de Otorgamiento: " + mesActual + " / " + añoActual + "			*");
		System.out.println("*		Fecha de Vencimiento: " + mesActual + " / " + (añoActual + calcularVigencia(mesActual, añoActual, antecedentes)) + "			*");
		System.out.println("*		Clase: B1					*");
;		System.out.println("*****************************************************************");

	}

	//Class method to calculate vigency
	int calcularVigencia (int mesAct, int añoAct, int antecedentes) {

		int edad = añoAct - año;
		if (mes > mesAct) edad--;
		if (edad <= 20 && antecedentes <= 2) return 3;
		else if ((edad <=20) && (antecedentes > 2)) return 2;
		else if (edad > 20 && edad <= 45 && antecedentes <= 3) return 5;
		else if (edad > 20 && edad <= 45 && antecedentes > 3) return 2;
		else if (edad > 45 && edad <= 59 && antecedentes <= 4) return 4;
		else if (edad > 45 && edad <= 59 && antecedentes > 4) return 2;
		else return 2;
	}

}
