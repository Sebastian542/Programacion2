package co.edu.unbosque.model.csv;

import java.util.ArrayList;
import java.util.List;

public class CsvWriter {
	

	    private List<Producto> csvList;



	    public void setCsvList(List<Producto> csvList) {
	        this.csvList = csvList;
	    }

	    public List<Producto> getCsvList() {
	        if (csvList != null) return csvList;
	        return new ArrayList<>();
	    }

}
