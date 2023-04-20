package ar.edu.unlp.info.oo2.ejercicio5_FileSystem;

import java.time.LocalDate;

public class Archivo extends Direccion{
	
	/**
	* Crea un nuevo archivo con nombre <nombre>, de <tamano> tamano
	* y en la fecha <fecha>.
	*/
	public Archivo (String nombre, LocalDate fecha, int tamano) {
		super(nombre, fecha, tamano);
	}
	/**
	* Retorna el espacio total ocupado, incluyendo su contenido.
	*/
	public int tamanoTotalOcupado() {
		return this.tamano;
	}
	/**
	* Retorna el archivo con mayor cantidad de bytes en cualquier nivel del
	* filesystem contenido por directorio receptor
	*/
	public Archivo archivoMasGrande() {
		return this;
	}
	/**
	* Retorna el archivo con fecha de creación más reciente en cualquier nivel
	* del filesystem contenido por directorio receptor.
	*/
	public Archivo archivoMasNuevo() {
		return this;
	}
	
}
