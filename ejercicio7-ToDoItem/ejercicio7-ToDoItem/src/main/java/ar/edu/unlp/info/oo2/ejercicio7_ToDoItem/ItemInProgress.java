package ar.edu.unlp.info.oo2.ejercicio7_ToDoItem;

import java.time.Duration;
import java.time.LocalDate;

public class ItemInProgress extends ItemStatus {
	
	public ItemInProgress() {
		this.estado = "In Progress";
	}
	@Override
	public void togglePause(ToDoItem item) {
		item.setStatusController(new ItemPaused());
	}
	public void finish(ToDoItem item) {
		item.setStatusController(new ItemFinished());
		item.setFinishedAt(LocalDate.now());
	}
	
	public Duration workedTime(ToDoItem item) {
		return Duration.between(item.getStartedAt(), LocalDate.now());
	}
}
