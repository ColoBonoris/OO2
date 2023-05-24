package ar.unlp.info.oo1.ejercicio4_Topografias;

public abstract class Topografia {
	public abstract double proporcionAgua();
	public abstract double proporcionTierra();
	public abstract boolean equals(Topografia t);
	public boolean compararConMixta(TopografiaMixta t) {
		return false;
	}
	@Override
	public boolean equals(Object o) {
		if(o instanceof Topografia) return this.equals((Topografia) o);
		return false;
	}
}
