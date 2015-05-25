package it.mondogrua.utils;

public class JavaUtilObservable extends java.util.Observable {

    public void changed(String attribute) {
        setChanged();
        notifyObservers(attribute);
        clearChanged();
    }

}
