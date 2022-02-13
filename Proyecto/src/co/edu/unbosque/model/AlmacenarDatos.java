package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Collections;

public class AlmacenarDatos {


	public ArrayList<String>datos;


	public AlmacenarDatos() {

		datos = new ArrayList<String>();
	}
	

	public void insertarNumero(String n ) {
		
		String[] separado= n.split("  ");
		
		//datos.add(new String (n));
		
		
		
		for(String almacena : separado){
			
		
			System.out.println("Los elementos almacenados de forma separada son : "+almacena);
			
			datos.add(new String (almacena));
		    
		}
		
	
		
	}

	
	public int mostrar() {
		
		return datos.size();
	}

	public ArrayList<String> getDatos() {
		return datos;
	}


	public void setDatos(ArrayList<String> datos) {
		this.datos = datos;
	}




	
	
}
