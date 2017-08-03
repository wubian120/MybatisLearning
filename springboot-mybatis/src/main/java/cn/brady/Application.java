package cn.brady;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Brady on 2017/7/12.
 */
@SpringBootApplication
public class Application  {

    public static void main(String[] args) throws Exception{

        System.out.println("Brian SpringBoot Application run!");
        SpringApplication.run(Application.class, args);

    }

}

