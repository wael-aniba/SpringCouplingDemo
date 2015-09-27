package edu.esprit.service;

import edu.esprit.annotation.Inject;
import edu.esprit.dao.DaoImpl1;
import edu.esprit.dao.IDao;
import edu.esprit.util.AppInitializer;

public class ServiceImpl1 implements IService {

	@Inject(DaoImpl1.class)
	private IDao dao;

	public ServiceImpl1() {
		
		AppInitializer.init(this);
		
	}
	
	public ServiceImpl1(IDao dao) {
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

		System.out.println("*** Average calculation using classic approach ***");
		Double avg = args.length > 0 ? dao.doubleSum(args) / args.length
				: 99999999999999d;

		return avg;

	}

}
