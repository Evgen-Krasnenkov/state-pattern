package org.kras.player;

public class PlayState implements State {
    @Override
    public void pause(MediaPlayer mediaPlayer) {
        mediaPlayer.setState(new PauseState());
        mediaPlayer.setIcon("play button");
        System.out.println("Video paused, icon set to " + mediaPlayer.getIcon());
    }

    @Override
    public void play(MediaPlayer mediaPlayer) {

    }
}
