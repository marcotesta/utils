package it.mondogrua.utils;

public abstract class Observer {
	
	private Observable subject;

	public Observer(Observable subject) {
		this.subject = subject;
	}

	public void update() {
		setValue(subject.getValueAsString());
	}

	public abstract void setValue(String value);
}
