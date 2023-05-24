package ar.edu.unlp.info.oo2.ejercicio7_ToDoItem;

import java.time.Duration;

public class ItemFinished extends ItemStatus {
	public ItemFinished() {
		this.estado = "Finished";
	}
	
	public Duration workedTime(ToDoItem item) {
		return Duration.between(item.getStartedAt(), item.getFinishedAt());
	}
	@Override
	public void addComment(ToDoItem item, String comment) {
		
	}
}
