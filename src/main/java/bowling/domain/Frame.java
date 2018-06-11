package bowling.domain;

import bowling.domain.state.Miss;
import bowling.domain.state.Ready;
import bowling.domain.state.Spare;
import bowling.domain.state.State;
import bowling.domain.state.Strike;

public class Frame implements Presentable {

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
        return state.canRoll();
    }

    public int getFrameid() {
        return id;
    }

    @Override
    public String getFrameScoreByString() {


        // FIXME 악취...

        if (state instanceof Strike) {
            return "X";
        } else if (state instanceof Spare) {
            return state.getPins() + "/";
        } else if (state instanceof Miss) {
            return String.valueOf(state.getPins());
        } else {
            return String.valueOf(state.getPins());
        }
    }
}
