package co.edu.unbosque.csv;

import com.opencsv.CSVReader;//external library

import co.edu.unbosque.model.AlmacenarDatos;

import java.io.FileReader; //Reads text from character files using a default buffer size


public class CsvReader{
	
	private AlmacenarDatos a;
	
	private String n;
	
	
	
	
	
		public CsvReader() {
				
			a=new AlmacenarDatos();
		
		}
		
		
		
		
		
	private static String LOCATION_OF_THE_FILE="Data/data.csv";//file location

	
	
	
	public  void main(String[] args){
		
		
    LineByLine(LOCATION_OF_THE_FILE);
    
        }
	
	
	
	
    public  void LineByLine(String myfile)
      {
       try
           {
    	   
    	   
        FileReader freader= new FileReader(myfile);//created an object of freader class
        @SuppressWarnings("resource")
        
        CSVReader creader= new CSVReader(freader);// created creader object by parsing freader as a parameter
        String [] nextRecord;// created an array of type String
        
        
        
        //read data line by line
        while((nextRecord = creader.readNext())!=null)
           {
        	
        
              
		
        	
        	for(String an: nextRecord)
				
            	
            	  //n=an; 
         
		//	System.out.println(an +"\t"); //will bring the value of cell seperated by tab space
               
           //  an=n;
             a.insertarNumero(an);
               

               
           }
        	
        
          // System.out.println("Muestro cantidad de array"+a.getDatos());
          
           a.ventasMes();

        
         a.totalVentas();
         
        
         a.buscarFactura();
           
           }
          catch(Exception e) //to catch any exception inside try block
       {
          e.printStackTrace();//used to print a throwable class along with other dataset class
  }

}

    
    
}