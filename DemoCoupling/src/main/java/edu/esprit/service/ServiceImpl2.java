package edu.esprit.service;

import java.util.stream.Stream;

import edu.esprit.dao.IDao;

public class ServiceImpl2 implements IService {

	private IDao dao;

	public ServiceImpl2() {
		
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
