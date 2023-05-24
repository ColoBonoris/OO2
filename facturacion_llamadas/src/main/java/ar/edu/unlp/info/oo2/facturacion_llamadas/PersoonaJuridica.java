package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class PersoonaJuridica extends Persoona {
	private String cuit;
	private static double descuentoJur = 0.15;

	public PersoonaJuridica(String nombreApellido, String telefono, String cuit, Persoonal sistema) {
		super(nombreApellido, telefono, sistema);
		this.cuit = cuit;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	protected double getDescuento() {
		return this.descuentoJur;
	}
}
