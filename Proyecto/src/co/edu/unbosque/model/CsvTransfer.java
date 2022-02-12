package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.List;

public class CsvTransfer {

    private List<Producto> csvList;

    public CsvTransfer() {}

    public void setCsvList(List<Producto> csvList) {
        this.csvList = csvList;
    }

    public List<Producto> getCsvList() {
        if (csvList != null) return csvList;
        return new ArrayList<>();
    }

}
