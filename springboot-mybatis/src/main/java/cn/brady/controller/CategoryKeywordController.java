package cn.brady.controller;

import cn.brady.dao.local.CategoryKeywordMapper;
import cn.brady.domain.Category;
import cn.brady.domain.Keyword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryKeywordController {


    @Autowired
    CategoryKeywordMapper mapper;

    @RequestMapping(value = "/k",method = RequestMethod.GET)
    public Category getKeywords(long id){

        return mapper.getCategoryId(id);
    }

    @RequestMapping(value = "/i",method = RequestMethod.GET)
    public void insertKeywords(){

//        String s = new String("");
        List<Keyword> keywords = new ArrayList<>();
        Keyword keyword1 = new Keyword();
        keyword1.setId(8);
        keyword1.setKeyword("油泼面");
        keyword1.setType(3);
        keyword1.setBizDate(201708);
        keyword1.setCategoryId(5);
        keyword1.setExclude(0);




        Keyword keyword2 = new Keyword();
        keyword2.setId(11);
        keyword2.setType(3);
        keyword2.setBizDate(201708);
        keyword2.setCategoryId(5);
        keyword2.setKeyword("spagatti");
        keyword2.setExclude(0);

        Keyword keyword3 = new Keyword();
        keyword3.setId(12);
        keyword3.setKeyword("noodles");
        keyword3.setType(3);
        keyword3.setBizDate(201708);
        keyword3.setExclude(0);
        keyword3.setCategoryId(5);

        keywords.add(keyword1);
        keywords.add(keyword2);
        keywords.add(keyword3);

        for (Keyword k : keywords) {
            System.out.println(k.getKeyword());
        }

//        mapper.insertKeyword(keywords);

        mapper.updateKeywords(keywords);

        System.out.println(" yeah works");

    }

    @RequestMapping(value = "/up",method = RequestMethod.GET)
    Keyword updateKeyword(){

        Keyword k = new Keyword();
        k.setId(11);
        k.setKeyword("中国中国中国");
        k.setCategoryId(5);
        k.setExclude(0);
        k.setBizDate(201709);
        k.setType(3);

//        mapper.updateKeywords(k);

        System.out.println(k.getKeyword());
//        return k;
        return null;

    }


}
