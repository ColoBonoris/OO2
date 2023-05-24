package ar.unlp.edu.info.oo2.ejercicio15_HomeWeatherStation;

import java.util.List;

public interface DisplayableStation {
	public double getTemperaturaFahrenheit();
	//retorna la presión atmosférica en hPa
	public double getPresion();
	//retorna la radiación solar
	public double getRadiacionSolar();
	//retorna una lista con todas las temperaturas sensadas hasta el momento, en grados Fahrenheit
	public List<Double> getTemperaturasFahrenheit();
	//retorna la temperatura en grados Celsius
	public double getTemperaturaCelsius();
	//retorna el promedio de todas las temperaturas sensadas hasta el momento, en grados Fahrenheit
	public double getPromedioFarenheit();
	
	public String display();
}
