package ar.edu.unlp.info.oo2.ejercicio2_Biblioteca;

import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONsimpleSocios {
	
	public JSONObject convert(Socio socio) {
		JSONObject json = new JSONObject();
		json.put("nombre", socio.getNombre());
		json.put("email", socio.getEmail());
		json.put("legajo", socio.getLegajo());
		return json;
	}
	
	public String exportar(List<Socio> socios) {
		JSONArray jsons = new JSONArray();
		socios.stream().forEach(socio -> jsons.add(convert(socio)));
		return jsons.toJSONString();
	} 
	
}
