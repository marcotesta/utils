package it.mondogrua.utils;

import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;

public class PropertyObservable extends SimpleStringProperty {

    private ComboObservable comboObservable;

    public PropertyObservable(ComboObservable mgObservable) {
        super("");
        this.comboObservable = mgObservable;
    }

    public void changed() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                set(comboObservable.getValue().toString());
            }
       });
    }

}
