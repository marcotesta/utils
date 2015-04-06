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
		} catch (NoSuchMethodException e) {
			// ...
		} catch (IllegalAccessException e) {
			// ...
		} catch (IllegalArgumentException e) {
			// ...
		} catch (InvocationTargetException e) {
			// ...
		}

	}

}
