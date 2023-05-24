package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class Llamada {
	protected String tipoDeLlamada;
	private String emisor;
	private String remitente;
	private int duracion;
	
	public Llamada() {}
	
	public Llamada(String tipoDeLlamada, String emisor, String remitente, int duracion) {
		this.tipoDeLlamada = tipoDeLlamada;
		this.emisor = emisor;
		this.remitente = remitente;
		this.setDuracion(duracion);
	}

	public String getTipoDeLlamada() {
		return tipoDeLlamada;
	}

	public void setTipoDeLlamada(String tipoDeLlamada) {
		this.tipoDeLlamada = tipoDeLlamada;
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
	
	public double costoLlamada() {
		if (this.tipoDeLlamada == "nacional") {
			return this.duracion *3 + (this.duracion*3*0.21);
		}
		return this.duracion *200 + (this.duracion*200*0.21);
	}
}
