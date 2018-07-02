package bowling.domain.state;

import bowling.domain.MaximumRollExceededException;
import bowling.domain.Pins;

public class Miss implements State {
    private final Pins knockDownsPins;

    Miss(Pins knockDownsPins) {
        this.knockDownsPins = knockDownsPins;
    }

    @Override
    public State roll(Pins pins) throws MaximumRollExceededException {
        throw new MaximumRollExceededException();
    }

    @Override
    public boolean canRoll() {
        return false;
    }

    @Override
    public int getKnockDownsPins() {
        return knockDownsPins.getKnockDownPins();
    }

    @Override
    public String getScore() {
        return knockDownsPins.getString();
    }

    @Override
    public boolean isStrike() {
        return false;
    }

    @Override
    public boolean isSpare() {
        return false;
    }
}
