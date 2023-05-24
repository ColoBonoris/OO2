package ar.unlp.edu.info.oo2.ejercicio14_FileManager;

import java.util.List;

public class FileManager {
	private List<FileOO2> files;

	public List<FileOO2> getFiles() {
		return files;
	}

	public void setFiles(List<FileOO2> files) {
		this.files = files;
	}
	
	public void addFile(FileOO2 file) {
		files.add(file);
	}
}
