package main.java;

public class Originator {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public Memento saveStateToMento() {
		return new Memento(state);
	}
	
	public void getStateFromMemento(Memento memento) {
		state = memento.getState();
	}
}
