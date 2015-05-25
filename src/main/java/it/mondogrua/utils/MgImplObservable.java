package it.mondogrua.utils;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class MgImplObservable {

    ArrayList<WeakReference<MgImplObserver>> observers;

    public abstract String getValueAsString();

    public void attach(MgImplObserver observer) {
        observers.add(new WeakReference<MgImplObserver>(observer))	;
    }

    public void updateAll() {

        for (Iterator<WeakReference<MgImplObserver>> it = observers.iterator(); it.hasNext(); ) {
            WeakReference<MgImplObserver> ref =  it.next();
            if (ref.get() == null) {
                observers.remove(ref);
            }
            MgImplObserver observer = ref.get();

            observer.update();
        }
    }
}
