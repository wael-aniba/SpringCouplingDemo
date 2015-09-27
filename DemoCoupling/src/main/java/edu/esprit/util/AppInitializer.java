
package edu.esprit.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import edu.esprit.annotation.Inject;

public class AppInitializer {


	public static void init(Object obj){

		Field[] fields = obj.getClass().getDeclaredFields();
		for (Field field : fields) {

			if (field.isAnnotationPresent(Inject.class)) {

				try {

					Inject injectAnnotation = (Inject) field.getAnnotation(Inject.class);
					Class targetImplementation = injectAnnotation.value();

					String setterName = "set"
							.concat(String.valueOf(field.getName().charAt(0)).toUpperCase())
							.concat(field.getName().substring(1, field.getName().length()));

					Method setter = obj.getClass().getMethod(setterName, field.getType());

					setter.invoke(obj, targetImplementation.newInstance());

				} catch (Exception e) {
					e.printStackTrace();

				}
			}
		}

	}

}
