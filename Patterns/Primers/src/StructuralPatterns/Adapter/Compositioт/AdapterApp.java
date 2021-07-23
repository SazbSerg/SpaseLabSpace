package StructuralPatterns.Adapter.Compositioт;

public class AdapterApp {
    public static void main(String[] args) {
        MusicPlayer musicPlayer1 = new Adapter();
        musicPlayer1.listenToMusic();
    }

}
