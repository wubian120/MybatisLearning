package cn.brady.domain;

import java.util.List;

public class CategoryKeywordVo extends Keyword{

    private Category category;


    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

}
