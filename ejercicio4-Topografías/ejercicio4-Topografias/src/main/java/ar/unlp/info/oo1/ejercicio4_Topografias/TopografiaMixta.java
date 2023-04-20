package ar.unlp.info.oo1.ejercicio4_Topografias;

import java.util.List;

public class TopografiaMixta implements Topografia {
	private List<Topografia> hijos; // Tengo que ver cómo lo restrinjo a 4
	
	public TopografiaMixta(List<Topografia> ts) {
		this.hijos = ts;
	}
	
	public double proporcionAgua() {
		return hijos.stream().mapToDouble(h -> h.proporcionAgua()).sum() / 4;
	}
	public double proporcionTierra() {
		return hijos.stream().mapToDouble(h -> h.proporcionTierra()).sum() / 4;
	}
	public boolean equals(Topografia t) {
		return hijos.equals(t);
	}
}
