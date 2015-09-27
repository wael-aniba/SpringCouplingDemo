package edu.esprit.service;

import edu.esprit.dao.DaoImpl;
import edu.esprit.dao.IDao;

public class ServiceImpl implements IService {

	private IDao dao;

	public ServiceImpl() {
		
	}

	public IDao getDao() {
		return dao;
	}

	public void setDao(IDao dao) {
		this.dao = dao;
	}

	@Override
	public Double doubleAvg(Double... args) {

		Double avg = args.length > 0 ? dao.doubleSum(args) / args.length
				: 99999999999999d;

		return avg;

	}

}
