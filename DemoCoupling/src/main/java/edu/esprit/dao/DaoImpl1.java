package edu.esprit.dao;

public class DaoImpl1 implements IDao {
	
	@Override
	public Double doubleSum(Double... args){
		
		System.out.println("*** Sum calculation using classic approach ***");
		Double sum = 0d;
		
		for (Double d : args) {
			sum += d;
		}
		
		return sum;
	}

}
