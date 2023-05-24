package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public abstract class Persoona {
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private String nombreApellido;
	private String telefono;
	private Persoonal sistema;
	
	public Persoona(String nombreApellido, String telefono, Persoonal sistema) {
		this.nombreApellido = nombreApellido;
		this.telefono = telefono;
		this.sistema = sistema;
	}
	
	public List<Llamada> getLlamadas() {
		return llamadas;
	}

	public void setLlamadas(List<Llamada> llamadas) {
		this.llamadas = llamadas;
	}
	
	public String getNombreApellido() {
		return nombreApellido;
	}

	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Persoonal getSistema() {
		return sistema;
	}

	public void setSistema(Persoonal sistema) {
		this.sistema = sistema;
	}

	public void agregarLlamada(Llamada llamada) {
		this.llamadas.add(llamada);
	}
	
	protected abstract double getDescuento();
	
	public double aplicarDescuento(double monto) {
		return monto - monto * this.getDescuento();
	}
}
