package ar.edu.unlp.info.oo2.facturacion_llamadas;

public abstract class Llamada {
	private String emisor;
	private String remitente;
	private int duracion;
	
	public Llamada(String emisor, String remitente, int duracion) {
		this.emisor = emisor;
		this.remitente = remitente;
		this.setDuracion(duracion);
	}
	
	public void setEmisor(String emisor) {
		this.emisor = emisor;
	}
	public String getEmisor() {
		return this.emisor;
	}
	public String getRemitente() {
		return remitente;
	}
	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public abstract double costoLlamada();
}
