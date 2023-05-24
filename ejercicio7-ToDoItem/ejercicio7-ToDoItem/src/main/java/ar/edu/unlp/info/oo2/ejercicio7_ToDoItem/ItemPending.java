package ar.edu.unlp.info.oo2.ejercicio7_ToDoItem;

import java.time.Duration;
import java.time.LocalDate;

public class ItemPending extends ItemStatus {
	
	public ItemPending() {
		this.estado = "Pending";
	}
	@Override
	public void start(ToDoItem item) {
		item.setStatusController(new ItemInProgress());
		item.setStartedAt(LocalDate.now());
	}
	public Duration workedTime(ToDoItem item) {
		throw new RuntimeException("El item no tiene duración alguna, se encuentra en estado" + this.estado + ", esperando ser iniciado.");
	}
}
