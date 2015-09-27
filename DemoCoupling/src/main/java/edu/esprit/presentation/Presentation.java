package edu.esprit.presentation;

import edu.esprit.service.ServiceImpl;

public class Presentation {

	public static void main(String[] args) {

		Double[] params = { 0d, 1d, 2d, 3d, 4d };

		ServiceImpl service = new ServiceImpl();

		Double result = service.doubleAvg(params);

		System.out.println("AVERAGE: " + result);

	}

}
