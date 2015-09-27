package edu.esprit.dao;

public class DaoImpl {
	
	//aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
	public Double doubleSum(Double... args){
		
		Double sum = 0d;
		
		for (Double d : args) {
			sum += d;
		}
		
		return sum;
	}

}
