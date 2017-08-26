package cn.brady.constant;

public enum CityLevel {


    FIRST(1,"一线"),
    SECOND(2,"二线"),
    THIRD(3,"三线"),
    FOURTH(4,"四线");

    private Integer levelId;
    private String  name;

    CityLevel(Integer levelId, String name){
        this.levelId = levelId;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public Integer getLevelId() {
        return levelId;
    }
}
