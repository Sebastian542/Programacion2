package co.edu.unbosque.model.csv;

import com.opencsv.CSVReader;//external library
import java.io.FileReader; //Reads text from character files using a default buffer size


public class CsvReader{
	
private static String LOCATION_OF_THE_FILE="C:\\Users\\SebastianM\\git\\Programacion2\\Proyecto\\Data\\data.csv";//file location

	public static void main(String[] args)
	{
    LineByLine(LOCATION_OF_THE_FILE);
        }
    public static void LineByLine(String myfile)
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
               for(String token: nextRecord)
               System.out.println(token +"\t"); //will bring the value of cell seperated by tab space
           }
           System.out.println();
           }
          catch(Exception e) //to catch any exception inside try block
       {
          e.printStackTrace();//used to print a throwable class along with other dataset class
  }

}

}