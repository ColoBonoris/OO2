package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Persoonal {
	List<Persoona> personas = new ArrayList<Persoona>();
	List<Llamada> llamadas = new ArrayList<Llamada>();
	GuiaTelefonica guia = new GuiaTelefonica();
	
	public boolean agregarTelefono(String telefono) {
		if (guia.existeTelefono(telefono)) return false;
		guia.agregarTelefono(telefono);
		return true;
	}
	
	private String nuevoNumero() {
		String telefono = guia.ultimoTelefono();
		guia.eliminarTelefono(telefono);
		return telefono;
	}
	
	public PersoonaFisica registrarUsuarioFisico(String identificacion, String nombreApellido) {
		PersoonaFisica persona = new PersoonaFisica(nombreApellido, nuevoNumero(), identificacion);
		personas.add(persona);
		return persona;
	}

	public PersoonaJuridica registrarUsuarioJuridico(String identificacion, String nombreApellido) {
		PersoonaJuridica persona = new PersoonaJuridica(nombreApellido, nuevoNumero(), identificacion);
		personas.add(persona);
		return persona;
	}
	
	public boolean eliminarUsuario(Persoona persona) {
		if (! personas.contains(persona)) return false;
		this.personas = (personas.stream()
				.filter(p -> p != persona)
				.collect(Collectors.toList()));;
		this.guia.agregarTelefono(persona.getTelefono());
		return true;
	}
	
	public LlamadaInternacional registrarLlamadaInternacional(Persoona emisor, Persoona remitente, int duracion) {
		LlamadaInternacional llamada = new LlamadaInternacional(emisor.getTelefono(), remitente.getTelefono(), duracion);
		emisor.agregarLlamada(llamada);
		return llamada;
	}
	
	public LlamadaNacional registrarLlamadaNacional(Persoona emisor, Persoona remitente, int duracion) {
		LlamadaNacional llamada = new LlamadaNacional(emisor.getTelefono(), remitente.getTelefono(), duracion);
		emisor.agregarLlamada(llamada);
		return llamada;
	}
	
	public double calcularMontoTotalLlamadas(Persoona persona) {
		if(! this.personas.contains(persona)) return 0;
		return persona.calcularMontoTotalLlamadas();
	}
	
	public int cantidadDeUsuarios() {
		return personas.size();
	}

	public boolean existeUsuario(Persoona persona) {
		return personas.contains(persona);
	}
}
