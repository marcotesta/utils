package it.mondogrua.utils;



public abstract class ComboObservable {

    private final JavaUtilObservable javaUtilsObservable = new JavaUtilObservable();

    private final PropertyObservable  propertyObservable = new PropertyObservable(this);


    public void addObserver(JavaUtilObserver javaUtilsObserver) {
        javaUtilsObserver.observe(this);
        javaUtilsObservable.addObserver(javaUtilsObserver);
    }

    public void addObserver(PropertyObserver propertyObserver) {
        propertyObserver.bind(propertyObservable);
    }

    public void changed(String attribute) {
        javaUtilsObservable.changed(attribute);
        propertyObservable.changed();
    }

    abstract public Object getValue();

}
