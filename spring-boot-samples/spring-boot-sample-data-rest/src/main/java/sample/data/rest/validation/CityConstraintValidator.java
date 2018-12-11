package sample.data.rest.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import sample.data.rest.domain.City;
import sample.data.rest.service.CityRepository;

public class CityConstraintValidator implements ConstraintValidator<CheckValid, City> {

	@Autowired
	private CityRepository cityRepository;

	@Override
	public void initialize(CheckValid constraintAnnotation) {
	}

	@Override
	public boolean isValid(City event, ConstraintValidatorContext context) {
		Assert.notNull(cityRepository, "DI not working!");
		return true;
	}

}
