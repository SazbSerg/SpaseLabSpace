package StructuralPatterns.Adapter.Inheritance;

public class Adapter extends AudioCassette implements MusicPlayer{
    @Override
    public void listenToMusic() {
        playCassete();
    }
}
