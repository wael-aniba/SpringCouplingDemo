package edu.esprit.presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.esprit.config.AppConfig;
import edu.esprit.service.IService;

public class Presentation {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		IService service = (IService) ctx.getBean("service");

		Double[] params = { 0d, 1d, 2d, 3d, 4d };
		Double result = service.doubleAvg(params);
		System.out.println("AVERAGE: " + result);

	}

}
