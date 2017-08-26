package cn.brady.dao.local;

import cn.brady.domain.Category;
import cn.brady.domain.Keyword;

import java.util.List;

public interface CategoryKeywordMapper {

    Category getCategoryId(long id);

    void updateCategory(Category category);

    void insertKeyword(List<Keyword> keywords);

    void updateKeywords(List<Keyword> keywords);


}
