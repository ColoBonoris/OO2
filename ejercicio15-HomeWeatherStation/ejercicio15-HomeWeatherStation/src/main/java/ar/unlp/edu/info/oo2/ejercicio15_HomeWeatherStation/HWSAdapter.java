package ar.unlp.edu.info.oo2.ejercicio15_HomeWeatherStation;

import java.util.List;

public class HWSAdapter implements DisplayableStation {
	
	private HomeWeatherStation hws;
	
	public HWSAdapter(HomeWeatherStation hws) {
		this.hws = hws;
	}
	
	public String display() {
		return "";
	}
	//retorna la temperatura en grados Fahrenheit
	public double getTemperaturaFahrenheit() {
		return this.hws.getTemperaturaFahrenheit();
	}
	//retorna la presión atmosférica en hPa
	public double getPresion() {
		return this.hws.getPresion();
	}
	//retorna la radiación solar
	public double getRadiacionSolar() {
		return this.hws.getRadiacionSolar();
	}
	//retorna una lista con todas las temperaturas sensadas hasta el momento, en grados Fahrenheit
	public List<Double> getTemperaturasFahrenheit(){
		return this.hws.getTemperaturasFahrenheit();
	}
	
	//retorna la temperatura en grados Celsius
	public double getTemperaturaCelsius() {
		return (this.hws.getTemperaturaFahrenheit() - 32) * 5 / 9;
	}
	//retorna el promedio de todas las temperaturas sensadas hasta el momento, en grados Fahrenheit
	public double getPromedioFarenheit() {
		return (this.getTemperaturasFahrenheit().stream().mapToDouble(t -> t.doubleValue()).sum()
				/ this.getTemperaturasFahrenheit().size());
	}
}









