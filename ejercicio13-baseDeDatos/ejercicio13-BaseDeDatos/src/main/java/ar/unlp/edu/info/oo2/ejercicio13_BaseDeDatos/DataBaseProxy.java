package ar.unlp.edu.info.oo2.ejercicio13_BaseDeDatos;

import java.util.Collection;
import java.util.List;

import ar.edu.unlp.info.oo2.accesobd.DatabaseAccess;
import ar.edu.unlp.info.oo2.accesobd.DatabaseRealAccess;

public class DataBaseProxy implements DatabaseAccess {
	
	private DatabaseRealAccess db;
	private boolean auth;
	
	public Collection<String> getSearchResults(String queryString){
		return null;
	}
    public int insertNewRow(List<String> rowData) throws Exception {
    	if(! auth) throw new Exception("Acceso denegado");
    	return db.insertNewRow(rowData);
    }
}
