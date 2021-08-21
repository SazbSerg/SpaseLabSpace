package ArchitecturePatterns.MVC.Prime2;

public class Model {
    private DataBase dataBase;

    public Model() {
        this.dataBase = DataBase.getInstance();
    }

    DataBase getData(){
        return dataBase;
    }

    void setData(int id, int age, String name, String email){
        dataBase.setId(id);
        dataBase.setAge(age);
        dataBase.setName(name);
        dataBase.setEmail(email);
    }
}
