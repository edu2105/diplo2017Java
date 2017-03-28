package com.utn.console;

public class Auto {
	
	//Atributos: Marca, Modelo, Color, Año
	String marca;
	String modelo;
	String color;
	int año;
	int velocidad;
	
	//Metodos: 
	//encender boolean
	
	//VelMaxima: velocidad>2010 vel max 230 km (BMW, Ferrari)
	//sino la maxima es de 180

	//Apagar: que verifique que el auto no esta en movimiento
	
	String Encender (boolean status) {
		if (status == true) return "Encendido";
		else return "Apagado";
	}
	
	int VelocidadMaxima (String marca1, int añoModelo) {
		if (((marca1 == "BMW")||(marca1 == "Ferrari")) && añoModelo>2010) return 230; 
		else return 180;
	}
	
	boolean Apagar (int vel) {
		if (vel==0) return true;
		else return false;
	}

}
