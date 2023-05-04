package org.kras.player;

public class PauseState implements State {
    @Override
    public void pause(MediaPlayer mediaPlayer) {

    }

    @Override
    public void play(MediaPlayer mediaPlayer) {
        mediaPlayer.setState(new PlayState());
        mediaPlayer.setIcon("pause button");
        System.out.println("Video playing, icon set to " + mediaPlayer.getIcon());
    }
}
