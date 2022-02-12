package co.edu.unbosque.model.csv;


import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class CsvReader {

	
	    public List<Producto> readCsvFile() throws FileNotFoundException {
	        FileReader reader =  new FileReader("Data/data.csv");
	        
	        CsvToBean<Producto> csvtobean= new CsvToBeanBuilder<Producto>(reader)
	                .withType(Producto.class)
	                .withSeparator(',')
	                .build();

	        return csvtobean.parse();
	    }
	}

