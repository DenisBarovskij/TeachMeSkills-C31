package Lesson_10;

public class User {
    private String name;
    private int age;
    private String adress;

    public User(String name, int age, String adress) {
        this.name = name;
        this.age = age;
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "User{" +
                "adress='" + adress + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + adress.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {

        User user = (User) obj;
        return this.name.equals(((User) obj).name) && this.adress.equals(((User) obj).adress);

    }
}


