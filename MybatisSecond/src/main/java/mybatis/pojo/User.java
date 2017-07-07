package mybatis.pojo;



/**
 * Created by Brady on 2017/4/27.
 */
public class User {

    private String    id;
    private String name;
    private int    age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "id: " + id + " username: " + name + " age: " + age ;
    }
}
