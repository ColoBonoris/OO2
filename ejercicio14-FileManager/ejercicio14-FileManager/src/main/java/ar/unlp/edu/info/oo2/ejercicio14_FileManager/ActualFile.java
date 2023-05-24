package ar.unlp.edu.info.oo2.ejercicio14_FileManager;

import java.time.LocalDate;
import java.util.List;

public class ActualFile {
	private String name, extension;
	private int size;
	private LocalDate creation, lastMod;
	private List<String> permits;
	
	public ActualFile prettyPrint() {
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public LocalDate getCreation() {
		return creation;
	}

	public void setCreation(LocalDate creation) {
		this.creation = creation;
	}

	public LocalDate getLastMod() {
		return lastMod;
	}

	public void setLastMod(LocalDate lastMod) {
		this.lastMod = lastMod;
	}

	public List<String> getPermits() {
		return permits;
	}

	public void setPermits(List<String> permits) {
		this.permits = permits;
	}
	
	
}
