package org.kras.fan;

public class FanStateLow implements FanState {
    @Override
    public void turnUp(Fan fan) {
        fan.setState(new FanStateMedium());
    }

    @Override
    public void turnDown(Fan fan) {

    }
}
