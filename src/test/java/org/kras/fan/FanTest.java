package org.kras.fan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FanTest {

    @Test
    void givenFanWithLowState_whenUpAndDown_thenFanMessageMatchesState() {
        Fan fan = new Fan();
        fan.turnUp();
        Assertions.assertEquals("FanStateMedium", fan.getMessage());
        fan.turnUp();
        Assertions.assertEquals("FanStateHigh", fan.getMessage());
        fan.turnDown();
        Assertions.assertEquals("FanStateMedium", fan.getMessage());
        fan.turnDown();
        Assertions.assertEquals("FanStateLow", fan.getMessage());
        fan.turnDown();
        Assertions.assertEquals("FanStateLow", fan.getMessage());
    }

}