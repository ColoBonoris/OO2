package ar.unlp.edu.info.oo2.ejercicio14_FileManager;

public abstract class FieldDisplayer implements FileOO2 {
	
	private FileOO2 next;

	public FileOO2 getNext() {
		return next;
	}

	public void setNext(FileOO2 next) {
		this.next = next;
	}
	
	public abstract void printField(ActualFile file);
	
	public ActualFile prettyPrint() {
		ActualFile file = this.getNext().prettyPrint();
		this.printField(file);
		return file;
	}
	
}
