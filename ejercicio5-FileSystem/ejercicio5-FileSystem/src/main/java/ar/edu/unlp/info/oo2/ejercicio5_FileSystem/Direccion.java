package ar.edu.unlp.info.oo2.ejercicio5_FileSystem;

import java.time.LocalDate;

public abstract class Direccion {
	
	protected String nombre;
	protected LocalDate fecha;
	protected int tamano;
	
	public Direccion(String nombre, LocalDate fecha, int tamano) {
		this.nombre = nombre;
		this.tamano = tamano;
		this.fecha = fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public int getTamano() {
		return tamano;
	}
	
	public abstract int tamanoTotalOcupado();
	public abstract Archivo archivoMasGrande();
	public abstract Archivo archivoMasNuevo();
}
