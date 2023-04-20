package ar.edu.unlp.info.oo2.ejercicio5_FileSystem;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class Directorio extends Direccion{
	
	private List<Direccion> contenido;
	
	/**
	* Crea un nuevo Directorio con nombre <nombre> y en la fecha <fecha>.
	*/
	public Directorio(String nombre, LocalDate fecha) {
		super(nombre, fecha, 32);
	}
	/**
	* Retorna el espacio total ocupado, incluyendo su contenido.
	*/
	public int tamanoTotalOcupado() {
		return this.contenido.stream().mapToInt(a -> a.getTamano()).sum();
	}
	/**
	* Retorna el archivo con mayor cantidad de bytes en cualquier nivel del
	* filesystem contenido por directorio receptor
	*/
	public Archivo archivoMasGrande() {
		return (Archivo) this.contenido.stream().max(Comparator.comparingInt(a -> a.archivoMasGrande().getTamano())).orElse(null);
	}
	/**
	* Retorna el archivo con fecha de creación más reciente en cualquier nivel
	* del filesystem contenido por directorio receptor.
	*/
	public Archivo archivoMasNuevo() {
		return (Archivo) this.contenido.stream().max(Comparator.comparing(a -> a.archivoMasNuevo().getFecha())).orElse(null);
	}
	
	public void agregar(Direccion fileName) {
		this.contenido.add(fileName);
	}
}
