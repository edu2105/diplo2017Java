package com.utn.controlador;

import com.utn.modelo.Pizza;

public class Microondas {
	
	public Pizza[] vecPizzas;
	
	public void  coccion () {
		//Solo puedo cocinar 5 pizzas
		vecPizzas = new Pizza[5];
		Pizza fPizza = new Pizza();
		
		Pizza p1 = new Pizza();
		vecPizzas[0] = fPizza.creoGrandeMuzza();
		vecPizzas[1] = fPizza.creoGrandeMuzza();
		vecPizzas[2] = fPizza.creoDobleQueso();
		
	}

}
