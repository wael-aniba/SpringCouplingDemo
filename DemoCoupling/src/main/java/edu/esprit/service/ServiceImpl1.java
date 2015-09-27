package edu.esprit.service;

import org.springframework.beans.factory.annotation.Autowired;

import edu.esprit.dao.IDao;

public class ServiceImpl1 implements IService {

	private IDao dao;

	public ServiceImpl1() {

	}

	public ServiceImpl1(IDao dao) {
		super();
		this.dao = dao;
	}

	public IDao getDao() {
		return dao;
	}

	@Autowired
	public void setDao(IDao dao) {
		this.dao = dao;
	}

	@Override
	public Double doubleAvg(Double... args) {

		System.out
				.println("*** Average calculation using classic approach ***");
		Double avg = args.length > 0 ? dao.doubleSum(args) / args.length
				: 99999999999999d;

		return avg;

	}

}
