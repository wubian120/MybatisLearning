package cn.brady.domain;

import java.util.ArrayList;
import java.util.List;

public class Category {

    private long id;
    private String categoryName;
    private double materialCost;

    private List<Keyword> keywords ;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setKeywords(List<Keyword> keywords) {
        this.keywords = keywords;
    }

    public List<Keyword> getKeywords() {
        return keywords;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public double getMaterialCost() {
        return materialCost;
    }

    public void setMaterialCost(double materialCost) {
        this.materialCost = materialCost;
    }
}
