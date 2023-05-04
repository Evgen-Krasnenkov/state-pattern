package org.kras.tune;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    @Test
    void givenPlayerWith3States_whenStateChange_thenCorrectMessageAppear(){
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }

}