package edu.esprit.service;

import edu.esprit.dao.DaoImpl;

public class ServiceImpl {

	private DaoImpl dao;

	public ServiceImpl() {

		dao = new DaoImpl();
	}

	public DaoImpl getDao() {
		return dao;
	}

	public void setDao(DaoImpl dao) {
		this.dao = dao;
	}

	public Double doubleAvg(Double... args) {

		Double avg = args.length > 0 ? dao.doubleSum(args) / args.length
				: 99999999999999d;

		return avg;

	}

}
