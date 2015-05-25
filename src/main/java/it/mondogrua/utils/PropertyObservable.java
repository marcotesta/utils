package it.mondogrua.utils;

import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;

public class PropertyObservable extends SimpleStringProperty {

    private ComboObservable mgObservable;

    public PropertyObservable(ComboObservable mgObservable) {
        super("");
        this.mgObservable = mgObservable;
    }

    public void changed() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                set(mgObservable.getValue().toString());
            }
       });
    }

}
