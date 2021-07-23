package StructuralPatterns.Adapter.Inheritance;

public class AdapterApp {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new Adapter();
        musicPlayer.listenToMusic();

    }
}
