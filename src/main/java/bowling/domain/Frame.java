package bowling.domain;

import bowling.domain.state.Ready;
import bowling.domain.state.State;

public class Frame {
    private final int id;
    private State state;

    public Frame(int id) {
        this.id = id;
        state = new Ready();
    }

    public void roll(int pins) {
        state = state.roll(pins);
    }

    public int getScore() {
        return state.getPins();
    }

    public boolean isEndFrame() {
        return !state.canRoll();
    }

    public int getFrameId() {
        return id;
    }

    public String getScoreBySymbol() {
        return state.getScoreBySymbol();
    }
}
