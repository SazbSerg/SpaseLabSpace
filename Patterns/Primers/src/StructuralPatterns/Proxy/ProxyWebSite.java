package StructuralPatterns.Proxy;

public class ProxyWebSite implements WebSite {
    String url;
    TargetWebSite site;

    public ProxyWebSite(String url) {
        this.url = url;
    }
    @Override
    public void display() {
        if (site==null){
            site = new TargetWebSite(url);
        }
        site.display();
    }
}
