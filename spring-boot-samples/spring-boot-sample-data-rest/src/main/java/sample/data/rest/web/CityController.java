package sample.data.rest.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sample.data.rest.domain.City;
import sample.data.rest.service.CityRepository;

@RestController
public class CityController {

	@Autowired
	private CityRepository cityRepository;

	@PostMapping("/api/test")
	public ResponseEntity<City> post(@RequestBody @Valid Resource<City> city) {
		return ResponseEntity.ok(this.cityRepository.save(city.getContent()));
	}

}
