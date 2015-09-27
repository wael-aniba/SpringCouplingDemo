package edu.esprit.presentation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.esprit.service.IService;

public class Presentation {

	public static void main(String[] args) {

		Double[] params = { 0d, 1d, 2d, 3d, 4d };

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		IService service = (IService) ctx.getBean("service");
		Double result = service.doubleAvg(params);
		System.out.println("AVERAGE: " + result);

	}

}
