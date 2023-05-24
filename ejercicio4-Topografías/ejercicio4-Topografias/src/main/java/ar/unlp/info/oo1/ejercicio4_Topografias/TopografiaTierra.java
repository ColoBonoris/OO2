package ar.unlp.info.oo1.ejercicio4_Topografias;

public class TopografiaTierra extends Topografia {
	public double proporcionAgua() {
		return 0;
	}
	public double proporcionTierra() {
		return 1;
	}
	public boolean equals(Topografia t) {
		return ((this.proporcionAgua() == t.proporcionAgua()) &&
				(this.proporcionTierra() == t.proporcionTierra()));
	}
}
