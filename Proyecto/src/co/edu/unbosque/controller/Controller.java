package co.edu.unbosque.controller;

import co.edu.unbosque.csv.CsvReader;
import co.edu.unbosque.csv.Producto;
import co.edu.unbosque.view.View;

public class Controller {

	private CsvReader lectura;
	
	private View gui;
	
	public Controller() {
		
		lectura=new CsvReader();
		gui = new View();
		
	
		funcionar();
		//gui.mostrarResultados(m.procesarDato(gui.pedirDato()));
	}
	
	public void funcionar() {
		
		lectura.main(null);
		System.out.println("________________________________________________________");
		
		


		
	}
	
}
