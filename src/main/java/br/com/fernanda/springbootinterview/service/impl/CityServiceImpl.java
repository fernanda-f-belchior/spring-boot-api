package br.com.fernanda.springbootinterview.service.impl;

import br.com.fernanda.springbootinterview.model.City;
import br.com.fernanda.springbootinterview.repository.CityRepository;
import br.com.fernanda.springbootinterview.service.CityService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Getter
@Setter
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    public void save(City city) {
        cityRepository.save(city);
    }

    public List<City> findByName(String name) {
        return cityRepository.findByNameIgnoreCaseContaining(name);
    }

    public List<City> findByState(String state) { return cityRepository.findByStateIgnoreCaseContaining(state);}


    public CityRepository getCityRepository() {
        return cityRepository;
    }
}
