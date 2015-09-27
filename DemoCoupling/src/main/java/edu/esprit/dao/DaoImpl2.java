package edu.esprit.dao;

import java.util.stream.Stream;

public class DaoImpl2 implements IDao {

	@Override
	public Double doubleSum(Double... args) {

		System.out
				.println("*** Sum calculation using lambdas and stream API ***");
		return Stream.of(args).mapToDouble(d -> d).sum();

	}

}
