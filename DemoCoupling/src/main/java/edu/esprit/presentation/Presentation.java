package edu.esprit.presentation;

import edu.esprit.dao.DaoImpl;
import edu.esprit.service.ServiceImpl;

public class Presentation {

	public static void main(String[] args) {

		Double[] params = { 0d, 1d, 2d, 3d, 4d };

		DaoImpl dao = new DaoImpl();
		ServiceImpl service = new ServiceImpl();
		service.setDao(dao);

		Double result = service.doubleAvg(params);

		System.out.println("AVERAGE: " + result);

	}

}
