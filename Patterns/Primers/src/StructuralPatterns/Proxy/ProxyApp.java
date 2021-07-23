package StructuralPatterns.Proxy;

public class ProxyApp {
    public static void main(String[] args) {
        //WebsSite targetSite = new TargetSite("https://www.google.com/");
        // targetSite.display();
        WebSite targetSite = new ProxyWebSite("https://www.google.com/");
        targetSite.display();
    }
}
