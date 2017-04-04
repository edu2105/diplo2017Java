package com.utn.vista;

import com.utn.controlador.Microondas;

public class Test {
	
	//Estoy parado en la vista, entonces puedo invocar al controlador
	public static void main (String argv[]) {
		Microondas m = new Microondas();
		m.coccion();
	}

}
