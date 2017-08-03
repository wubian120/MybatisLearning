package cn.brady.controller;

import cn.brady.dao.local.CityDao;
import cn.brady.domain.City;
import cn.brady.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityController {

    @Autowired
    private CityService cityService;

    @Autowired
    private CityDao cityDao;

    @RequestMapping(value = "/api/cities", method = RequestMethod.GET)
    public List<City> getAllCities(){

//        return cityDao.getAllCities();
        return  cityService.getAllCities();

    }

}
