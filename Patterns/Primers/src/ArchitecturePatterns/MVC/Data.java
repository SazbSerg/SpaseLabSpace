package ArchitecturePatterns.MVC;

public class Data {
    private static int id = 1;
    private static String name = "Tom";
    private static String email = "tom@gmail.com";

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
