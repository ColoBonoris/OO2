package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Persoonal {
	List<Persoona> personas = new ArrayList<Persoona>();
	List<Llamada> llamadas = new ArrayList<Llamada>();
	GuiaTelefonica guia = new GuiaTelefonica();
	
	public boolean agregarTelefono(String telefono) {
		boolean encontre = guia.existeTelefono(telefono);
		if (!encontre) {
			guia.agregarTelefono(telefono);
			encontre= true;
			return encontre;
		}
		else {
			encontre = false;
			return encontre;
		}
	}
	
	public Persoona registrarUsuario(String identificacion, String nombreApellido,
			String tipo) {
		Persoona persona = null;
		if (tipo.equals("fisica")) {
			String telefono = guia.ultimoTelefono();
			guia.eliminarTelefono(telefono);
			persona = new PersoonaFisica(nombreApellido, telefono, identificacion, this);
			personas.add(persona);
		}
		else if (tipo.equals("juridica")) {
			String telefono = guia.ultimoTelefono();
			guia.eliminarTelefono(telefono);
			persona = new PersoonaJuridica(nombreApellido, telefono, identificacion, this);
			personas.add(persona);
		}
		return persona;
	}
	
	public boolean eliminarUsuario(Persoona persona) {
		List<Persoona> personasNueva = (personas.stream()
				.filter(p -> p != persona).collect(Collectors.toList()));
		boolean borre = false;
		if (personasNueva.size() < personas.size()) {
			this.personas = personasNueva;
			this.guia.agregarTelefono(persona.getTelefono());
			borre = true;
		}
		return borre;
		
	}
	
	public Llamada registrarLlamada(Persoona emisor, Persoona remitente,
			String tipoLlamada, int duracion) {
		Llamada llamada = new Llamada(tipoLlamada, emisor.getTelefono(),
				remitente.getTelefono(), duracion);
		emisor.agregarLlamada(llamada);
		return llamada;
	}
	
	public double calcularMontoTotalLlamadas(Persoona persona) {
		double montoTotal = 0;
		Persoona personaAux = null;
		for (Persoona p : personas) {
			if (p.getTelefono() == persona.getTelefono()) {
				personaAux = p;
				break;
			}
		}
		if (personaAux == null) return montoTotal;
		if (personaAux != null) {
			for (Llamada l : personaAux.getLlamadas()) {
				double costoAux = 0;
				costoAux = persona.aplicarDescuento(l.costoLlamada());
				montoTotal += costoAux;
			}
		}
		return montoTotal;
	}

	public int cantidadDeUsuarios() {
		return personas.size();
	}

	public boolean existeUsuario(Persoona persona) {
		return personas.contains(persona);
	}
}
