package org.kras.fan;

public class FanStateHigh implements FanState {
    public static final String MESSAGE = "Fan is on High";

    @Override
    public void turnUp(Fan fan) {

    }

    @Override
    public void turnDown(Fan fan) {
        fan.setState(new FanStateMedium());
    }
}
