package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class PersoonaFisica extends Persoona{
	private String documento;
	private static double descuentoFis = 0;

	public PersoonaFisica(String nombreApellido, String telefono, String documento, Persoonal sistema) {
		super(nombreApellido, telefono, sistema);
		this.documento = documento;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	protected double getDescuento() {
		return this.descuentoFis;
	}
}
