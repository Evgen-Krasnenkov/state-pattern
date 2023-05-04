package org.kras.fan;

public class FanStateMedium implements FanState {
    public static final String MESSAGE = "Fan is on medium";

    @Override
    public void turnUp(Fan fan) {
        fan.setState(new FanStateHigh());
    }

    @Override
    public void turnDown(Fan fan) {
        fan.setState(new FanStateLow());
    }
}
