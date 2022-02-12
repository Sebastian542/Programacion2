package co.edu.unbosque.controller;

import co.edu.unbosque.model.csv.Producto;
import co.edu.unbosque.view.View;

public class Controller {

	private Producto c;
	
	private View gui;
	
	public Controller() {
		
		c=new Producto();
		gui = new View();
	
		funcionar();
		//gui.mostrarResultados(m.procesarDato(gui.pedirDato()));
	}
	
	public void funcionar() {
		
		c.toString();

		
	}
	
}
