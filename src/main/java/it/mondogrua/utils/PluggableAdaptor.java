package it.mondogrua.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PluggableAdaptor {

    private final Object model;

    private final String action;

    private final Object[] parameters;


    public PluggableAdaptor(Object aModel, String anAction, Object[] someParameters) {
        this.model = aModel;
        this.action = anAction;
        this.parameters = someParameters;
    }


    public void execute() {
        Method method;
        try {
            method = model.getClass().getMethod(action);
            method.invoke(model, parameters);
        } catch (SecurityException e) {
            // ...
            int stop = 0;
        } catch (NoSuchMethodException e) {
            // ...
            int stop = 0;
        } catch (IllegalAccessException e) {
            // ...
            int stop = 0;
        } catch (IllegalArgumentException e) {
            // ...
            int stop = 0;
        } catch (InvocationTargetException e) {
            // ...
            int stop = 0;
        }

    }

}
