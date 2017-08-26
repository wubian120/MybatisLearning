package cn.brady.experiment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExpe {


    public static void main(String[] args){

        Map<String,String> configParam = new HashMap<>();


        String key = "门店范围";
        String value = "6.6";

        String key1 = "菜品范围";
        String value1 = "1000";
        configParam.put(key,value);
        configParam.put(key1,value1);


        Iterator iterator = configParam.keySet().iterator();
        while (iterator.hasNext()){

            Object o = iterator.next();

            System.out.println(
                    "key: "+(String) o +" value : "+configParam.get(o)  );

        }

    }

}
