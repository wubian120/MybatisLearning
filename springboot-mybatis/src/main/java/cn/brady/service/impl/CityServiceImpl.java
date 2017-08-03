package cn.brady.service.impl;

import cn.brady.dao.local.CityDao;
import cn.brady.domain.City;
import cn.brady.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService{

    @Autowired
    private CityDao cityDao;



    @Override
    public List<City> getAllCities() {
        return cityDao.getAllCities();
    }
}
