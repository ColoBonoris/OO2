package ar.edu.unlp.info.oo2.ejercicio7_ToDoItem;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
	private ItemStatus statusController;
	private String name;
	private LocalDate startedAt, finishedAt;
	private List<String> comments;
	
	/**
	* Instancia un ToDoItem nuevo en estado pending con <name> como nombre.
	*/
	public ToDoItem(String name) {
		this.name = name;
		this.comments =  new ArrayList<String>();
		this.statusController = new ItemPending();
	}
	/**
	* Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
	* pending. Si se encuentra en otro estado, no hace nada.
	*/
	public void start() {
		
	}
	/**
	* Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su
	* estado es paused. Caso contrario (pending o finished) genera un error
	* informando la causa específica del mismo.
	*/
	public void togglePause() {
		
	}
	/**
	* Pasa el ToDoItem a finished, siempre y cuando su estado actual sea
	* in-progress o paused. Si se encuentra en otro estado, no hace nada.
	*/
	public void finish() {
		
	}
	/**
	* Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
	* hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
	* haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
	* * genera un error informando la causa específica del mismo.
	*/
	public Duration workedTime() {
		
	}
	/**
	* Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
	* contrario no hace nada."
	*/
	public void addComment(String comment) {
		
	}
}

