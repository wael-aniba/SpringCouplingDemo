package edu.esprit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import edu.esprit.dao.DaoImpl2;
import edu.esprit.dao.IDao;
import edu.esprit.service.IService;
import edu.esprit.service.ServiceImpl2;

@Configuration
public class AppConfig {

	@Bean
	public IDao idao() {

		return new DaoImpl2();
	}

	@Bean
	public IService service() {

		return new ServiceImpl2();
	}
}
