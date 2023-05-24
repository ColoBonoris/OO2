package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.TreeSet;
import java.util.SortedSet;

public class GuiaTelefonica {
	
	private SortedSet<String> telefonos = new TreeSet<String>();

	public SortedSet<String> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(SortedSet<String> telefonos) {
		this.telefonos = telefonos;
	}
	
	public boolean existeTelefono(String telefono) {
		return this.telefonos.contains(telefono);
	}
	
	public void agregarTelefono(String telefono) {
		this.telefonos.add(telefono);
	}
	
	public void eliminarTelefono(String telefono) {
		this.telefonos.remove(telefono);
	}
	
	public String ultimoTelefono() {
		return this.telefonos.last();
	}
}
