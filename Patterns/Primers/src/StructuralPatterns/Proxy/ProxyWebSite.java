package StructuralPatterns.Proxy;

public class ProxyWebSite implements WebSite {
    private String url;
    private TargetWebSite site;

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
