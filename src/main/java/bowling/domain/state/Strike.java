package bowling.domain.state;

import bowling.domain.ExceedException;

public class Strike implements State {

    @Override
    public State roll(int pins) {
        throw new ExceedException();
    }

    @Override
    public boolean isKnockDownAll() {
        return true;
    }

    @Override
    public int getPins() {
        return 10;
    }

    @Override
    public boolean canRoll() {
        return true;
    }
}
