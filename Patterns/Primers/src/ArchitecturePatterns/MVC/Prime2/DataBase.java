package ArchitecturePatterns.MVC.Prime2;

public class DataBase {
    private int id = 1;
    private int age = 25;
    private String name = "Peter";
    private String email = "piter@gmail.com";

    private static DataBase instance;
    private DataBase(){};

    public static DataBase getInstance(){
        if (instance == null){
            instance = new DataBase();
        }
        return instance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
