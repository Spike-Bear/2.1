public class use {
    private String name;
    private Integer age;

    public use (String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        name = name;
    }

    public Integer getAge () {
        return age;
    }

    public void setAge (Integer age) {
        age = age;
    }

    public String toString() {
        return name + ", возраст "  + age + " лет";
    }

}