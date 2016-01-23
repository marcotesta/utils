package it.mondogrua.valuemodel;

import java.util.Observable;

public class JavaUtilsObservable extends Observable {
	
	private ValueModel count;

	public JavaUtilsObservable(ValueModel count) {
		this.count = count;
	}
	
    public void changed(String attribute) {
        setChanged();
        notifyObservers(attribute);
        clearChanged();
    }
    
    public Object getValue() {
        return count.getValue();
    }

}
