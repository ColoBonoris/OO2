package ar.edu.unlp.info.oo2.ejercicio7_ToDoItem;

import java.time.Duration;

public abstract class ItemStatus {
	
	protected String estado;
	
	public void togglePause(ToDoItem item) {
		throw new RuntimeException("No puede controlarse la pausa del item, su estado es " + this.estado);
	}
	public void start(ToDoItem item) {
		
	}
	public void finish(ToDoItem item) {
		
	}
	
	public abstract Duration workedTime(ToDoItem item);
	
	public void addComment(ToDoItem item, String comment) {
		item.getComments().add(comment);
	}
	
}
