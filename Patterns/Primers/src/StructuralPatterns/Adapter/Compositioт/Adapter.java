package StructuralPatterns.Adapter.Compositioт;

public class Adapter implements MusicPlayer{
    AudioCassette audioCassette = new AudioCassette();
    @Override
    public void listenToMusic() {
        audioCassette.playCassete();
    }
}
