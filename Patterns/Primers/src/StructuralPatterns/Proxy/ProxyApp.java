package StructuralPatterns.Proxy;

public class ProxyApp {
    public static void main(String[] args) {

        WebSite targetSite = new ProxyWebSite("https://www.google.com/");
        targetSite.display();
    }
}
