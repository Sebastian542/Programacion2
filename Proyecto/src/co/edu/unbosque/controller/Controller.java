package co.edu.unbosque.controller;

import co.edu.unbosque.csv.CsvReader;
import co.edu.unbosque.csv.Producto;
import co.edu.unbosque.model.AlmacenarDatos;
import co.edu.unbosque.view.View;

public class Controller {

	private CsvReader lectura;
	private AlmacenarDatos almDatos;
	
	private View gui;
	
	public Controller() {
		
		almDatos=new AlmacenarDatos();
		lectura=new CsvReader();
		gui = new View();
		
	
		funcionar();
		//gui.mostrarResultados(m.procesarDato(gui.pedirDato()));
	}
	
	public void funcionar() {
		
		
	
		
		lectura.main(null);
	
		
		System.out.println("________________________________________________________");
		
		
		//int busqueda=gui.pedirDatoEntero("Ingrese el id");
		
		//String busqueda=gui.pedirDato();
		
		//lectura.setBusqueda(busqueda);
		//almDatos.setBusqueda(busqueda);
		
		


		
	}
	
}
