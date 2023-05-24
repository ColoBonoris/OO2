package ar.unlp.edu.info.oo2.ejercicio15_HomeWeatherStation;


public class CelsiusDisplayer extends StationDecorator {
	
	public CelsiusDisplayer(DisplayableStation next) {
		super(next);
	}

	public String display() {
		return "Nombre archivo " + this.getTemperaturaCelsius() + " " + getNext().display();
	}
	
}
