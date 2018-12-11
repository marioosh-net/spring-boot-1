package sample.data.rest;

import javax.validation.Validator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Configuration
public class ValidationConfig {

	@Bean
	public Validator validator() {
		return new LocalValidatorFactoryBean();
	}

}
