package com.utn.modelo;

public class Pizza {
	
	public Ingrediente[] ingredientes;
	public String nombre;
	public int tiempoCoccion;
	public double precio;

	public Pizza creoGrandeMuzza() {
		//Tomate
		//Muzarella
		//Oregano
		Pizza pizza = new Pizza();
		ingredientes = new Ingrediente[3];
		//Para la posicion 0 del vector de tipo Ingrediente, inicializo un objeto del tipo Ingrediente.
		//Mismo para la posicion 1 y 2.
		ingredientes[0] = new Ingrediente();
		ingredientes[1] = new Ingrediente();
		ingredientes[2] = new Ingrediente();
		//Comienzo a dar valores a cada objeto.
		ingredientes[0].nombre = "Tomate";
		ingredientes[0].cantidad = 3;
		ingredientes[1].nombre = "Muzarella";
		ingredientes[2].nombre = "Oregano";
		pizza.ingredientes = ingredientes; 	//redundancia de datos
		pizza.nombre = "Grande de Muzza";
		pizza.tiempoCoccion = 5;
		pizza.precio = 120;
		return pizza;
	}
	
	public Pizza creoDobleQueso() {
		//Tomate
		//Muzarella
		//Provolone
		//Jamon
		Pizza pizza = new Pizza();
		ingredientes = new Ingrediente[4];
		//Para la posicion 0 del vector de tipo Ingrediente, inicializo un objeto del tipo Ingrediente.
		//Mismo para la posicion 1 y 2.
		ingredientes[0] = new Ingrediente();
		ingredientes[1] = new Ingrediente();
		ingredientes[2] = new Ingrediente();
		ingredientes[3] = new Ingrediente();
		//--
		ingredientes[0].nombre = "Tomate";
		ingredientes[1].nombre = "Muzarella";
		ingredientes[2].nombre = "Provolone";
		ingredientes[3].nombre = "Jamon";
		pizza.ingredientes = ingredientes; 	//redundancia de datos
		pizza.nombre = "Doble Queso";
		pizza.tiempoCoccion = 10;
		pizza.precio = 180;
		return pizza;
	}
	
	public Pizza creoVegetariana () {
		//Acelga
		//Tomate
		//Salsa Blanca
		//Queso Rallado
		Pizza pizza = new Pizza();
		ingredientes = new Ingrediente[4];
		//Para la posicion 0 del vector de tipo Ingrediente, inicializo un objeto del tipo Ingrediente.
		//Mismo para la posicion 1 y 2.
		ingredientes[0] = new Ingrediente();
		ingredientes[1] = new Ingrediente();
		ingredientes[2] = new Ingrediente();
		ingredientes[3] = new Ingrediente();
		//--
		ingredientes[0].nombre = "Tomate";
		ingredientes[1].nombre = "Acelga";
		ingredientes[2].nombre = "Salsa Blanca";
		ingredientes[3].nombre = "Queso Rallado";
		pizza.ingredientes = ingredientes; 	//redundancia de datos
		pizza.nombre = "La Vegetariana";
		pizza.tiempoCoccion = 15;
		pizza.precio = 150;
		return pizza;
	}
	
}
