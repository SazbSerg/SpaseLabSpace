package StructuralPatterns.Proxy;

public class TargetWebSite implements WebSite {
    String url;
    public TargetWebSite(String url) {
        this.url = url;
        load();
    }
    public void load(){
        System.out.println("Загрузка сайта по адресу " + url);
    }

    @Override
    public void display() {
        System.out.println("Сайт по адресу " + url + " отображается на экране");
    }
}
