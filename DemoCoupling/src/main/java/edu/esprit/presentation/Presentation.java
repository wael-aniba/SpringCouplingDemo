package edu.esprit.presentation;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;

import edu.esprit.dao.IDao;
import edu.esprit.service.IService;

public class Presentation {

	public static void main(String[] args) {

		Double[] params = { 0d, 1d, 2d, 3d, 4d };

		// Dynamic Injection via reflection
		Properties prop = new Properties();

		try {

			prop.load(new FileInputStream("src/main/resources/config.properties"));

			String daoClassName = (String) prop.get("dao");
			String serviceClassName = (String) prop.get("service");

			IDao dao = (IDao) Class.forName(daoClassName).newInstance();
			IService service = (IService) Class.forName(serviceClassName).newInstance();

			Method daoSetter = service.getClass().getMethod("setDao",IDao.class);
			daoSetter.invoke(service, dao);

			Double result = service.doubleAvg(params);
			System.out.println("AVERAGE: " + result);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
