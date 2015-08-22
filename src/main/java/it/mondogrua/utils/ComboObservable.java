package it.mondogrua.utils;

import javafx.beans.property.SimpleStringProperty;



public abstract class ComboObservable {

    private final JavaUtilObservable javaUtilsObservable = new JavaUtilObservable(this);

    private final PropertyObservable  propertyObservable = new PropertyObservable(this);


    public void addObserver(java.util.Observer javaUtilsObserver) {
        javaUtilsObservable.addObserver(javaUtilsObserver);
    }

    public void addObserver(SimpleStringProperty propertyObserver) {
        propertyObserver.bind(propertyObservable);
    }

    public void changed(String attribute) {
        javaUtilsObservable.changed(attribute);
        propertyObservable.changed();
    }

    public JavaUtilObservable asJavaUtilObservable() {
        return javaUtilsObservable;
    }

    abstract public Object getValue();

}
