package ar.unlp.info.oo1.ejercicio4_Topografias;

public class TopografiaAgua extends Topografia {
	public double proporcionAgua() {
		return 1;
	}
	public double proporcionTierra() {
		return 0;
	}
	@Override
	public boolean equals(Topografia t) {
		return ((this.proporcionAgua() == t.proporcionAgua()) &&
				(this.proporcionTierra() == t.proporcionTierra()));
	}
}
