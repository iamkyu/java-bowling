package bowling.domain.state;

import bowling.domain.MaximumRollExceededException;

public class Strike implements State {
    @Override
    public State roll(int pins) {
        throw new MaximumRollExceededException();
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

    @Override
    public String getScoreBySymbol() {
        return "X";
    }
}
