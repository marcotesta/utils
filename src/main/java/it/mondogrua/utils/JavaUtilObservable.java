package it.mondogrua.utils;

public class JavaUtilObservable extends java.util.Observable {

    private ComboObservable comboObservable;

    public JavaUtilObservable(ComboObservable comboObservable) {
        super();
        this.comboObservable = comboObservable;
    }

    public void changed(String attribute) {
        setChanged();
        notifyObservers(attribute);
        clearChanged();
    }

    public Object getValue() {
        return comboObservable.getValue();
    }


}
