package org.kras.player;

import org.junit.jupiter.api.Test;

class MediaPlayerTest {

    @Test
    void testMediaPlayer(){
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.play();
        mediaPlayer.pause();
    }

}