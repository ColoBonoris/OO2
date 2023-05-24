package ar.unlp.edu.info.oo2.ejercicio15_HomeWeatherStation;

import java.util.ArrayList;
import java.util.List;

public class HomeWeatherStation {
	private List<Double> historiaFarenheit;
	
	public HomeWeatherStation() {
		this.historiaFarenheit = new ArrayList<Double>();
	}
	//retorna la temperatura en grados Fahrenheit
	public double getTemperaturaFahrenheit() {
		this.historiaFarenheit.add(2.0);
		return 2.0;
	}
	//retorna la presión atmosférica en hPa
	public double getPresion() {
		return 1.0;
	}
	//retorna la radiación solar
	public double getRadiacionSolar() {
		return 0.0;
	}
	//retorna una lista con todas las temperaturas sensadas hasta el momento, en grados Fahrenheit
	public List<Double> getTemperaturasFahrenheit(){
		return this.historiaFarenheit;
	}
}
