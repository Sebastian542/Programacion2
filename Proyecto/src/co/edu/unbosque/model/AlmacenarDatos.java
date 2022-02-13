package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Collections;

public class AlmacenarDatos {


	public ArrayList<String>datos;
	public ArrayList<String>totalMes;


	public AlmacenarDatos() {

		datos = new ArrayList<String>();
		totalMes = new ArrayList<String>();
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

	public void ventasMes() {
		
	//String operacion=	datos.get(3)+datos.get(5);
	
	
	  
	   
	   //int n1 = Integer.parseInt(datos.get(3)); 
	  

	  // int n2 = Integer.parseInt(datos.get(5)); 
		
	  //float n1 = Float.valueOf(datos.get(11));
	 // float n2 = Float.valueOf(datos.get(13)); 
	  
	  int a = 11;
	  int b=0;
	  float operacion1 = 0;
	  float operacion2 = 0;
	  for (int n = 0 ;n<4;a++) {
		  
		  	
		  	b=a+2;

			float n1 = Float.valueOf(datos.get(a));
			
			float n2 = Float.valueOf(datos.get(b));
			
			 operacion1=n1*n2;
			 String op2 = Float.toString(operacion1);
			 totalMes.add(op2);
			
			a=a+7;
			n++;
			System.out.println("operare los siguientes valores"+n1+"  *  "+n2+"  =  "+operacion1);
			
			//String op2 = Float.toString(operacion1);
			//totalMes.add(op2);
			
			
	  }

		   
		    
	  
		
	}
	
  public void totalVentas() {
	  
	 /* System.out.println(totalMes.size());
		  
	  for (int i=0;i<totalMes.size();i++) {
	      
	      System.out.println(totalMes.get(i));
	      
	    
	    } */

	  	double suma=0;
	  for(int i=0;i<totalMes.size();i++){ 
		    Float valor =null;
		   
		        valor =  Float.valueOf(totalMes.get(i));
		   
		    suma+=valor;
		
	  }
	  System.out.println("El valor total de ventas es  : "+suma);
	  
	  }
	  


public ArrayList<String> getTotalMes() {
	return totalMes;
}


public void setTotalMes(ArrayList<String> totalMes) {
	this.totalMes = totalMes;
}
	

	
	
}
