package it.mondogrua.utils;

import javafx.beans.property.SimpleStringProperty;

public class PropertyObserver extends SimpleStringProperty {

    public void observe(ComboObservable mgObservable) {
        mgObservable.addObserver(this);
    }

}
