package edu.esprit.service;

import java.util.stream.Stream;

import edu.esprit.annotation.Inject;
import edu.esprit.dao.DaoImpl2;
import edu.esprit.dao.IDao;
import edu.esprit.util.AppInitializer;

public class ServiceImpl2 implements IService {

	@Inject(DaoImpl2.class)
	private IDao dao;

	public ServiceImpl2() {
	
		AppInitializer.init(this);
	}
	
	public ServiceImpl2(IDao dao) {
		super();
		this.dao = dao;
	}

	public IDao getDao() {
		return dao;
	}

	public void setDao(IDao dao) {
		this.dao = dao;
	}

	@Override
	public Double doubleAvg(Double... args) {

		System.out.println("*** Average calculation using lambdas and stream API ***");
		Double avg = Stream.of(args).count() > 0 ? dao.doubleSum(args) / Stream.of(args).count()
				: 99999999999999d;

		return avg;

	}

}
