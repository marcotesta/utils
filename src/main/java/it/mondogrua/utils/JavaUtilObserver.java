package it.mondogrua.utils;

import java.util.Observable;

public class JavaUtilObserver implements java.util.Observer {

    private final JavaUtilObserverObserver mgObserver;
    private ComboObservable mgObservable;

    public JavaUtilObserver(JavaUtilObserverObserver mgObserver) {
        super();
        this.mgObserver = mgObserver;
    }

    @Override // java.util.Observer
    public void update(Observable observable, Object arg) {
        mgObserver.update(mgObservable, arg);
    }

    public void observe(ComboObservable mgObservable) {
        this.mgObservable = mgObservable;
    }

}
