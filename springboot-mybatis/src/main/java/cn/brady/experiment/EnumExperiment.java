package cn.brady.experiment;

import cn.brady.constant.CityLevel;

import java.util.EnumSet;

public class EnumExperiment {


    public static void main(String[] args){

        EnumSet<CityLevel> levels = EnumSet.allOf(CityLevel.class);

        for(CityLevel level : levels){
            System.out.println("level : "+level.getLevelId() + " name :" + level.getName());

        }


    }

}
