package cn.brady.domain;

public class Keyword {

    private long id;
    private String keyword;
    private int type;
    private int bizDate;
    private int exclude;
    private long categoryId;


//    public Category getCategory() { return category; }
//    public void setCategory(Category category) { this.category = category; }

    public long getCategoryId() { return categoryId; }
    public void setCategoryId(long categoryId) { this.categoryId = categoryId; }

    public void setId(long id) { this.id = id; }
    public long getId() { return id; }

    public String getKeyword() { return keyword; }
    public void setKeyword(String keyword) { this.keyword = keyword; }

    public void setType(int type) { this.type = type; }
    public int getType() { return type; }

    public int getExclude() { return exclude; }
    public void setExclude(int exclude) { this.exclude = exclude; }

    public void setBizDate(int bizDate) { this.bizDate = bizDate; }
    public int getBizDate() { return bizDate; }
}
