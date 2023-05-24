package ar.unlp.edu.info.oo2.ejercicio15_HomeWeatherStation;

import java.util.List;

public abstract class StationDecorator implements DisplayableStation {
	private DisplayableStation next;
	
	public StationDecorator(DisplayableStation next) {
		this.next = next;
	}

	public DisplayableStation getNext() {
		return next;
	}
	
	public abstract String display();
	
	
	public double getTemperaturaFahrenheit() {
		return next.getTemperaturaFahrenheit();
	}
	//retorna la presión atmosférica en hPa
	public double getPresion() {
		return next.getPresion();
	}
	//retorna la radiación solar
	public double getRadiacionSolar() {
		return next.getRadiacionSolar();
	}
	//retorna una lista con todas las temperaturas sensadas hasta el momento, en grados Fahrenheit
	public List<Double> getTemperaturasFahrenheit(){
		return next.getTemperaturasFahrenheit();
	}
	//retorna la temperatura en grados Celsius
	public double getTemperaturaCelsius() {
		return next.getTemperaturaCelsius();
	}
	//retorna el promedio de todas las temperaturas sensadas hasta el momento, en grados Fahrenheit
	public double getPromedioFarenheit() {
		return next.getPromedioFarenheit();
	}
}
