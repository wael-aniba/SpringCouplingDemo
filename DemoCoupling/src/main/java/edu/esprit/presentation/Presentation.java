package edu.esprit.presentation;

import edu.esprit.annotation.Inject;
import edu.esprit.service.IService;
import edu.esprit.service.ServiceImpl2;
import edu.esprit.util.AppInitializer;

public class Presentation {

	@Inject(ServiceImpl2.class)
	private static IService service;

	public static IService getService() {
		return service;
	}

	public static void setService(IService service) {
		Presentation.service = service;
	}

	public static void main(String[] args) {

		Presentation presentation = new Presentation();
		AppInitializer.init(presentation);

		Double[] params = { 0d, 1d, 2d, 3d, 4d };

		Double result = presentation.getService().doubleAvg(params);
		System.out.println("AVERAGE: " + result);

	}

}
