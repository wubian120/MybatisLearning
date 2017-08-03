package cn.brady.dao.local;

import cn.brady.domain.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CityDao {

//    @Select("select * from city")
//    @Results({
//            @Result(property = "id", column = "id"),
//            @Result(property = "provinceId", column = "province_id"),
//            @Result(property = "cityName", column = "city_name"),
//            @Result(property = "description", column = "description")
//    })
    List<City> getAllCities();

}
