package it.mondogrua.utils;

public abstract class MgImplObserver {
	
	private MgImplObservable subject;

	public MgImplObserver(MgImplObservable subject) {
		this.subject = subject;
	}

	public void update() {
		setValue(subject.getValueAsString());
	}

	public abstract void setValue(String value);
}
