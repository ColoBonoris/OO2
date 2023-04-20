package ar.unlp.info.oo1.ejercicio4_Topografias;

public abstract interface Topografia {
	public double proporcionAgua();
	public double proporcionTierra();
	public boolean equals(Topografia t);
}
