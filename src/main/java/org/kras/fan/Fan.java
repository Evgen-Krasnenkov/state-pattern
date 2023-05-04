package org.kras.fan;

public class Fan {
    private String message = "";

    private FanState state = new FanStateLow();

    public String getMessage() {
        return message;
    }

    public void setState(FanState state) {
        this.state = state;
        this.message = state.getClass().getSimpleName();
    }

    public FanState getState() {
        return state;
    }

    public void turnUp() {
        state.turnUp(this);
    }

    public void turnDown() {
        state.turnDown(this);
    }
}
